package com.example.eurekaservice.action;

import com.example.feigninterface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return userService.hello();
    }

}
