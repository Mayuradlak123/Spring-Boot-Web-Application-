package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@ResponseStatus
@ResponseBody
public class loginController {
    @PostMapping("/login")
    public String login(@ModelAttribute loginController login){
        System.out.println(login.toString());
        return "Logged In Successfully";
    }
}
