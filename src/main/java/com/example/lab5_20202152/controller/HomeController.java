package com.example.lab5_20202152.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/inicio")
    public String index(){
        return "travelcan";
    }
}
