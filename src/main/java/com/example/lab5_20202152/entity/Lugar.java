package com.example.lab5_20202152.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "lugares")

public class Lugar{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre_lugar", length = 45)
    private String nombreLugar;

    @Column(name = "descrip_lugar", length = 45)
    private String descripLugar;

    @Column(name = "fecha_lugar")
    private LocalDate fechaLugar;


}
