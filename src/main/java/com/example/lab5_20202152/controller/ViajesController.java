package com.example.lab5_20202152.controller;
import com.example.lab5_20202152.entity.Lugar;
import com.example.lab5_20202152.entity.Mascota;
import com.example.lab5_20202152.entity.Viaje;
import com.example.lab5_20202152.repository.LugarRepository;
import com.example.lab5_20202152.repository.MascotaRepository;
import org.springframework.ui.Model;
import com.example.lab5_20202152.repository.ViajeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/viaje")
public class ViajesController {

    final ViajeRepository viajeRepository;
    public ViajesController(ViajeRepository viajeRepository, LugarRepository lugarRepository, MascotaRepository mascotaRepository) {
        this.viajeRepository = viajeRepository;
        this.lugarRepository = lugarRepository;
        this.mascotaRepository = mascotaRepository;
    }
    final LugarRepository lugarRepository;
    final MascotaRepository mascotaRepository;
    @GetMapping("/viajes")
    public String inicioViaje(Model model){
        List<Viaje> list = viajeRepository.findAll();
        model.addAttribute("viajeList", list);
        return "viajes/viajes";
    }
    @GetMapping("/nuevoviaje")
    public String nuevoViajes(Model model) {
        List<Viaje> lista = viajeRepository.findAll();
        model.addAttribute("viajeLista", lista);
        List<Lugar> list = lugarRepository.findAll();
        model.addAttribute("listaLugar", list);
        return "viajes/nuevoViaje";
    }

    @PostMapping("/save")
    public String guardarNuevoViaje(Viaje viaje, RedirectAttributes attr) {
        viajeRepository.save(viaje);
        return "redirect:/viajes/viajes";
    }

    @GetMapping("/nuevamascota")
    public String nuevaMascota(Model model) {
        List<Viaje> lista = viajeRepository.findAll();
        model.addAttribute("viajeLista", lista);
        List<Lugar> list = lugarRepository.findAll();
        model.addAttribute("listaLugar", list);
        List<Mascota> list1 = mascotaRepository.findAll();
        model.addAttribute("listaLugar", list1);
        return "viajes/nuevaMascota";
    }
    @PostMapping("/save2")
    public String guardarNuevaMascota(Viaje viaje, RedirectAttributes attr) {
        viajeRepository.save(viaje);
        return "redirect:/viajes/viajes";
    }
}
