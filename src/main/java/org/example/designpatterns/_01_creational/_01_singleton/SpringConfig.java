package org.example.designpatterns._01_creational._01_singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public String hello() {
        return "hello";
    }

}
