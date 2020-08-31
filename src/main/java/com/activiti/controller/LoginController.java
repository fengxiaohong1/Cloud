package com.activiti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fxh
 */
@RestController
public class LoginController {
    @RequestMapping("login")
    public ModelAndView login(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }


    @RequestMapping("doLogin")
    public Map<String,Object> doLogin(){
        Map<String,Object> map = new HashMap<>();


        return  map;
    }
}
