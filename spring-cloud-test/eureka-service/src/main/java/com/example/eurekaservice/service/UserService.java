package com.example.eurekaservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-user-service")
public interface UserService {
    @GetMapping("/user/hello")
    String hello();
}
