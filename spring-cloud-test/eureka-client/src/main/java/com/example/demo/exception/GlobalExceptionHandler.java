package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常，拦截所有action抛出的异常，并格式化返回
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    public Map<String, Object> defaultHandler(HttpServletRequest request, Exception e) {
        Map<String, Object> result = new HashMap<>();
        result.put("status", true);
        result.put("code", 500);
        result.put("data", "hello");
        result.put("msg", e.getMessage());
        return result;
    }
}
