package org.vaadin.example;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.security.Timestamp;

public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facturaId;

    @ManyToOne
    @JoinColumn(name = "reserva_id", referencedColumnName = "reservaId")
    private Reserva reserva;

    private String numeroFactura;
    private BigDecimal montoTotal;
    private BigDecimal impuestos;
    private BigDecimal totalConImpuestos;

    @Enumerated(EnumType.STRING)
    private EstadoFactura estado;

    private Timestamp fechaEmision;

    public enum EstadoFactura {
        PENDIENTE, PAGADA, ANULADA
    }

    // Getters y setters
}