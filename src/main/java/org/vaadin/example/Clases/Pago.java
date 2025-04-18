package org.vaadin.example.Clases;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "pagos") // Recomendado para claridad en la base de datos
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagoId;

    @ManyToOne
    @JoinColumn(name = "reserva_id", referencedColumnName = "reservaId")
    private Reserva reserva;

    private BigDecimal cantidad;

    @Enumerated(EnumType.STRING) // <- Faltaba esta anotación
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

    public Long getPagoId() {
        return pagoId;
    }

    public void setPagoId(Long pagoId) {
        this.pagoId = pagoId;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Timestamp getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Timestamp fechaPago) {
        this.fechaPago = fechaPago;
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }
}
