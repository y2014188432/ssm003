package com.y.controller;

import com.y.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserHandler {
    //裂开
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Test1");
        modelAndView.addObject("list",userService.findAll());
        return modelAndView;
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}