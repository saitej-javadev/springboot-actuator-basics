package com.example.springboot.actuatorbasics.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBHealthService implements HealthIndicator {

    public static final String DB_SERVICE = "DB_Service";

    public boolean isHealthOk(){
        return false;
    }

    @Override
    public Health health() {

        if (isHealthOk()){
            return Health.up().withDetail(DB_SERVICE,"Database is UP").build();
        }
        return Health.down().withDetail(DB_SERVICE,"Database is DOWN").build();
    }
}
