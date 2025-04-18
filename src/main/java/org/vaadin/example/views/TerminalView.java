package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Clases.Terminal;
import org.vaadin.example.Repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route("terminales")
public class TerminalView extends VerticalLayout {

    private final TerminalRepository terminalRepository;

    @Autowired
    public TerminalView(TerminalRepository terminalRepository) {
        this.terminalRepository = terminalRepository;

        Grid<Terminal> grid = new Grid<>(Terminal.class);
        grid.setItems(terminalRepository.findAll());
        add(new H1("Lista de Terminales"), grid);
    }
}
