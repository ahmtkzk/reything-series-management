package com.reything.seriesmanagement.service.util.rest.impl;

import com.reything.seriesmanagement.service.util.rest.RestCallService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestCallServiceImpl implements RestCallService {

    private static final Logger LOGGER = LogManager.getLogger(RestCallServiceImpl.class);

    //TODO In trial phase.
    @Override
    public ResponseEntity<String> postCall(String URL) {
        LOGGER.info("Rest service has been called: " + URL);
        return new RestTemplate().getForEntity(URL, String.class);
    }

}
