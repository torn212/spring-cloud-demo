package com.example.demo.action;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserAction {

    @GetMapping("/user/hello")
    public String hello() {
        log.info("被调用 --- hello接口");
        return "lk";
    }
}
