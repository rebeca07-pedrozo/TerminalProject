package org.vaadin.example.Clases;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity // Faltaba esta anotación para que sea reconocida como entidad JPA
@Table(name = "recomendaciones_horarios") // Opcional, pero recomendable para claridad
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

    public Long getRecomendacionId() {
        return recomendacionId;
    }

    public void setRecomendacionId(Long recomendacionId) {
        this.recomendacionId = recomendacionId;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public LocalTime getHorarioRecomendado() {
        return horarioRecomendado;
    }

    public void setHorarioRecomendado(LocalTime horarioRecomendado) {
        this.horarioRecomendado = horarioRecomendado;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
}
