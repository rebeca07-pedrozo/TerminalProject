package org.vaadin.example.Clases;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.sql.Timestamp;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservaId;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id") // Este nombre debe coincidir con el de la columna real
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

    public Long getReservaId() {
        return reservaId;
    }

    public void setReservaId(Long reservaId) {
        this.reservaId = reservaId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Integer getCantidadPasajes() {
        return cantidadPasajes;
    }

    public void setCantidadPasajes(Integer cantidadPasajes) {
        this.cantidadPasajes = cantidadPasajes;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public Timestamp getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Timestamp fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
