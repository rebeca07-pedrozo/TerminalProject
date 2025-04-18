package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vaadin.example.Clases.Viaje;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Long> {
}

