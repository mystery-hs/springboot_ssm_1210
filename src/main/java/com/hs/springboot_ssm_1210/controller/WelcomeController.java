package com.hs.springboot_ssm_1210.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String welcom(){
        return "welcome";
    }

}
