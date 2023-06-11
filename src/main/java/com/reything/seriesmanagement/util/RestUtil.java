package com.reything.seriesmanagement.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestUtil {

    private RestUtil() {}

    private static final Logger LOGGER = LogManager.getLogger(RestUtil.class);

    public static <T> T postCall(String URL, Class<T> request, Class<T> response) {
        LOGGER.info("[POST] Rest service has been called: " + URL);
        return new RestTemplate().postForEntity(URL, request, response).getBody();
    }

    public static <T> T getCall(String URL, Class<T> response) {
        LOGGER.info("[GET] Rest service has been called: " + URL);
        return new RestTemplate().getForEntity(URL, response).getBody();
    }

}
