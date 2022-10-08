package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "https://blog.blood.com");
        return "index";
    }
}
