package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.example.Clases.Pago;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    // Métodos personalizados si lo necesitas
}
