package com.example.demo;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {
    @GetMapping("/login")
    public String login(Model info){
        user user=new user();
        info.addAttribute("user", user);

        return "login";
    }

}