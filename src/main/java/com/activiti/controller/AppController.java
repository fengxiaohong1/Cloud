package com.activiti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fxh
 */
@RestController
public class AppController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
