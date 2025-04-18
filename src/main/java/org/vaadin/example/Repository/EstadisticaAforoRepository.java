package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.example.Clases.EstadisticaAforo;

public interface EstadisticaAforoRepository extends JpaRepository<EstadisticaAforo, Long> {
}
