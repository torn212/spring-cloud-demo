package com.example.eurekaservice.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    public String hello() {
        String forObject = restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
        System.out.println(forObject);
        return forObject;
    }
}
