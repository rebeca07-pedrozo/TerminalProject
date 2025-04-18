package org.vaadin.example;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.security.Timestamp;

public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagoId;

    @ManyToOne
    @JoinColumn(name = "reserva_id", referencedColumnName = "reservaId")
    private Reserva reserva;

    private BigDecimal cantidad;
    private MetodoPago metodoPago;

    @CreationTimestamp
    private Timestamp fechaPago;

    @Enumerated(EnumType.STRING)
    private EstadoPago estado;

    public enum MetodoPago {
        TARJETA, EFECTIVO, OTROS
    }

    public enum EstadoPago {
        PENDIENTE, COMPLETADO, FALLIDO
    }

    // Getters y setters
}