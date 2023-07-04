package com.example.demo.spring.web;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class postAPIRequest {
    @PostMapping("/register")
    public  String Register (@ModelAttribute userData user){
        System.out.println(user.toString());
         return user.toString();
    }
}
