package com.microservices.demo.kafka.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.support.RetryTemplate;

@Configuration
public class RetryTemplateConfig {
    @Bean
    public RetryTemplate retryTemplate(){
        return new RetryTemplate();
    }
}
