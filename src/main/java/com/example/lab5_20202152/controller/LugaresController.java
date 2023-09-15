package com.example.lab5_20202152.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lugar")
public class LugaresController {
    @GetMapping("/lugares")
    public String inicioLugar() {
        return "lugares/lugares";
    }
    @GetMapping("/editarlugar")
    public String editarLugar() {
        return "lugares/editLugar";
    }

    @GetMapping("/nuevolugar")
    public String nuevoLugar() {
        return "lugares/nuevoLugar";
    }

}
