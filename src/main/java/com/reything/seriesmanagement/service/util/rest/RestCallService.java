package com.reything.seriesmanagement.service.util.rest;

import org.springframework.http.ResponseEntity;

public interface RestCallService {

    ResponseEntity<String> postCall(String URL);

}
