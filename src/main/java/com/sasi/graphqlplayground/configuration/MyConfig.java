package com.sasi.graphqlplayground.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sasi.graphqlplayground.controller.MyPlaygroundController;
import graphql.kickstart.playground.boot.PlaygroundPropertiesConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyPlaygroundController playgroundController() {
        return new MyPlaygroundController(new PlaygroundPropertiesConfiguration(), new ObjectMapper());
    }
}
