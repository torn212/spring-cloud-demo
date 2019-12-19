package com.example.eurekaservice;

import com.example.eurekaservice.action.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EurekaServiceApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        userService.hello();
        userService.hello();
        userService.hello();
        userService.hello();
        userService.hello();
        userService.hello();
    }

}
