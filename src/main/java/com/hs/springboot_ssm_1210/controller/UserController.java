package com.hs.springboot_ssm_1210.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hs.springboot_ssm_1210.pojo.User;
import com.hs.springboot_ssm_1210.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView login(String name, String password, HttpSession session,ModelAndView mv){
        System.out.println(name+" "+password);
        User user = userService.login(name, password);
        if (user != null) {
            List<User> list = userService.findAll();

            session.setAttribute("loginUser",user);
            mv.setViewName("main");
            return mv;
        }
        mv.setViewName("error");
        return mv;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() throws JsonProcessingException {
        List<User> list = userService.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String users = objectMapper.writeValueAsString(list);
        return users;
    }

}
