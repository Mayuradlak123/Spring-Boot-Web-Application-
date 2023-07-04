package com.example.demo.Controller;
import com.example.demo.Services.userData;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
class registerController {
    @PostMapping("/register")
    public  String Register (@ModelAttribute userData user){
        System.out.println(user.toString());
        return user.toString();
    }
}
