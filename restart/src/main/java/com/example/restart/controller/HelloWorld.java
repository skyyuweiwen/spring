package com.example.restart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.restart.Exception.MyException;

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

    @RequestMapping("/helloerror")
    public String helloError() throws Exception{
        throw new Exception("test error");
    }

    @RequestMapping("/hellemyexception")
    public String helloExcptin() throws MyException {
        throw new MyException("My Exception error.");
    }
}
