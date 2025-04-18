package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vaadin.example.Clases.Terminal;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Long> {
}
