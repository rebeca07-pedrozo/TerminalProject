package org.vaadin.example;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.security.Timestamp;

public class EstadisticaAforo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aforoId;

    @ManyToOne
    @JoinColumn(name = "viaje_id", referencedColumnName = "viajeId")
    private Viaje viaje;

    @CreationTimestamp
    private Timestamp fechaRegistro;
    private Integer pasajerosRegistrados;
    private Integer capacidadTotal;
    private BigDecimal porcentajeOcupacion;

    // Getters y setters
}