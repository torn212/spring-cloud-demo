package com.example.demo.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {

    @GetMapping("/user/hello")
    public String hello() {
        System.out.println("调用了hello接口");
        return "lk";
    }
}
