package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

    @RequestMapping(value = "/login.action")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
}
