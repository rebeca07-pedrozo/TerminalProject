package org.vaadin.example;

import jakarta.persistence.*;

import java.time.LocalTime;

public class RecomendacionHorario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recomendacionId;

    @ManyToOne
    @JoinColumn(name = "viaje_id", referencedColumnName = "viajeId")
    private Viaje viaje;

    private LocalTime horarioRecomendado;
    private String razon;

    // Getters y setters
}