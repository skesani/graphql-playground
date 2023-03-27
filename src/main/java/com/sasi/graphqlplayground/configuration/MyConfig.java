package com.sasi.graphqlplayground.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sasi.graphqlplayground.controller.FDAPlaygroundController;
import graphql.kickstart.playground.boot.PlaygroundPropertiesConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public FDAPlaygroundController playgroundController() {
        return new FDAPlaygroundController(new PlaygroundPropertiesConfiguration(), new ObjectMapper());
    }
}
