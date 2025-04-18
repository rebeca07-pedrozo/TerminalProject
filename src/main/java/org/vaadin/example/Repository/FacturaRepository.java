package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.example.Clases.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
    // Métodos personalizados si es necesario
}
