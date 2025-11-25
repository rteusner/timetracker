package de.thbrandenburg.rt.timetracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from my Spring Boot app!";
    }

    @RequestMapping(value = "/hellothyme")
    public String home(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "index.html";
    }

}