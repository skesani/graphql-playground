package com.sasi.graphqlplayground.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import graphql.kickstart.playground.boot.PlaygroundController;
import graphql.kickstart.playground.boot.PlaygroundPropertiesConfiguration;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyPlaygroundController extends PlaygroundController {

    private static final String _CSRF = "_csrf";

    public MyPlaygroundController(PlaygroundPropertiesConfiguration propertiesConfiguration, ObjectMapper objectMapper) {
        super(propertiesConfiguration, objectMapper);
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer testsjhajsjhabdjbjjjbn");
        propertiesConfiguration.getPlayground().setHeaders(headers);
    }
}
