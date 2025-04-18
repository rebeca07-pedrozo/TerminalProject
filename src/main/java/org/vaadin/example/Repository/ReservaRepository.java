package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.example.Clases.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    // Métodos personalizados si los necesitas
}
