package ru.kata.spring.boot_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

}
