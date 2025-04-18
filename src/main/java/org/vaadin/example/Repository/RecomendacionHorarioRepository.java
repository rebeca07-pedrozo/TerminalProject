package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.example.Clases.RecomendacionHorario;

public interface RecomendacionHorarioRepository extends JpaRepository<RecomendacionHorario, Long> {
    // Métodos personalizados si lo necesitas
}
