package org.vaadin.example;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.security.Timestamp;
import java.time.LocalTime;

@Entity
@Table(name = "terminales")
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long terminalId;

    private String nombre;
    private String ubicacion;
    private Integer capacidad;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    @CreationTimestamp
    private Timestamp fechaCreacion;

}
