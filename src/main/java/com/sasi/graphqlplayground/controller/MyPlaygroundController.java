package com.sasi.graphqlplayground.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import graphql.kickstart.playground.boot.PlaygroundController;
import graphql.kickstart.playground.boot.PlaygroundPropertiesConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyPlaygroundController extends PlaygroundController {

    private static final String _CSRF = "_csrf";
    private PlaygroundPropertiesConfiguration propertiesConfiguration;
    private ObjectMapper objectMapper;

    public MyPlaygroundController(PlaygroundPropertiesConfiguration propertiesConfiguration, ObjectMapper objectMapper) {
        super(propertiesConfiguration, objectMapper);
        System.out.println("in the contoller MyPlaygroundController");
    }


    @GetMapping("playground")
    public String playground() {
        System.out.println("in the playground MyPlaygroundController");
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer testsjhajsjhabdjbjjjbn");
        propertiesConfiguration.getPlayground().setHeaders(headers);
        return "playground1";
    }
}
