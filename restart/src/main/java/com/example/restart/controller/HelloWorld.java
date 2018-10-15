package com.example.restart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
    public String hi(){
        return "Hello World";
    }

    @RequestMapping(value="/")
    public String index(ModelMap map){
        map.addAttribute("host", "springboot-lyd");
        return "index";
    }

}
