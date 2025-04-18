package org.vaadin.example;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "viajes")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long viajeId;

    @ManyToOne
    @JoinColumn(name = "terminal_origen_id", referencedColumnName = "terminalId")
    private Terminal terminalOrigen;

    @ManyToOne
    @JoinColumn(name = "terminal_destino_id", referencedColumnName = "terminalId")
    private Terminal terminalDestino;

    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private Integer disponibilidad;
    private BigDecimal precio;

    // Getters y setters
}