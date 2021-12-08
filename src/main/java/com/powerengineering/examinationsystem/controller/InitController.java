package com.powerengineering.examinationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class InitController {

    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/toZC")
    public String toZC(){
        return "loginZC";
    }

    @RequestMapping("/toAddTag")
    public String toAddTag(){
        return "tagAdd";
    }

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }
}
