package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/post")
    public  String getPost(){
        return "post";
    }

    @PostMapping(value = "/post")
    public String post(@ModelAttribute("user") String user, Model model, String pass) {
        model.addAttribute("user", user);
        model.addAttribute("pass", pass);
        return "exit";

    }
}
