package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Clases.Reserva;
import org.vaadin.example.Repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route("reservas")
public class ReservasView extends VerticalLayout {

    private final ReservaRepository reservaRepository;
    private final Grid<Reserva> grid = new Grid<>(Reserva.class);

    @Autowired
    public ReservasView(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
        grid.setItems(reservaRepository.findAll());
        add(grid);
    }
}
