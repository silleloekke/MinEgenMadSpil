package com.example.minegenmadspil.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MadSpildController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/readmore")
    public String test(){
        return "readmore";
    }

}
