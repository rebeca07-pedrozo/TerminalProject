package org.vaadin.example.Clases;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "estadistica_aforo")
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

    // Getters y Setters
    public Long getAforoId() {
        return aforoId;
    }

    public void setAforoId(Long aforoId) {
        this.aforoId = aforoId;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getPasajerosRegistrados() {
        return pasajerosRegistrados;
    }

    public void setPasajerosRegistrados(Integer pasajerosRegistrados) {
        this.pasajerosRegistrados = pasajerosRegistrados;
    }

    public Integer getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(Integer capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public BigDecimal getPorcentajeOcupacion() {
        return porcentajeOcupacion;
    }

    public void setPorcentajeOcupacion(BigDecimal porcentajeOcupacion) {
        this.porcentajeOcupacion = porcentajeOcupacion;
    }
}
