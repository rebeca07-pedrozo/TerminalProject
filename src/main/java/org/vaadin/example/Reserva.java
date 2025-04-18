package org.vaadin.example;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.security.Timestamp;

public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservaId;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuarioId")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "viaje_id", referencedColumnName = "viajeId")
    private Viaje viaje;

    private Integer cantidadPasajes;

    @Enumerated(EnumType.STRING)
    private EstadoReserva estado;

    @CreationTimestamp
    private Timestamp fechaReserva;

    public enum EstadoReserva {
        PENDIENTE, CONFIRMADA, CANCELADA
    }

    // Getters y setters
}