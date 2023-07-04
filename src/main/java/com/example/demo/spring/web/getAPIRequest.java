package com.example.demo.spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getAPIRequest {
    @GetMapping("/name")
    @ResponseBody
    public String index(){
        return "index";
    }
}
