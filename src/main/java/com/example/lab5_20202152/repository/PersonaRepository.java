package com.example.lab5_20202152.repository;
import com.example.lab5_20202152.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}
