package com.example.lab5_20202152.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mascota")
public class MascotasController {
    @GetMapping("/mascotas")
    public String iniciomascotas() {
        return "mascotas/mascota";
    }
    @GetMapping("/editarmascotas")
    public String editarMascotas() {
        return "mascotas/editMascotas";
    }

    @GetMapping("/nuevomascota")
    public String nuevoMascota() {
        return "mascota/nuevaMascota";
    }
}
