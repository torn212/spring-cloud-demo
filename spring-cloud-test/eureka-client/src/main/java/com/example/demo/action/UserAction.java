package com.example.demo.action;

import com.example.feigninterface.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction implements UserService {

    @Override
    public String hello() {
        System.out.println("调用了hello接口");
        return "lk";
    }
}
