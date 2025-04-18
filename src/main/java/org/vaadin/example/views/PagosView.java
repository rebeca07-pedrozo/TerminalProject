package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Clases.Pago;
import org.vaadin.example.Repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route("pagos")
public class PagosView extends VerticalLayout {

    private final PagoRepository pagoRepository;
    private final Grid<Pago> grid = new Grid<>(Pago.class);

    @Autowired
    public PagosView(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
        grid.setItems(pagoRepository.findAll());
        add(grid);
    }
}
