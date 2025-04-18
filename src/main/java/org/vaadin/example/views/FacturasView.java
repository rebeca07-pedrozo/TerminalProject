package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.example.Clases.Factura;
import org.vaadin.example.Repository.FacturaRepository;

@Route("facturas")
public class FacturasView extends VerticalLayout {

    private final FacturaRepository facturaRepository;
    private final Grid<Factura> grid = new Grid<>(Factura.class);

    @Autowired
    public FacturasView(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
        grid.setItems(facturaRepository.findAll());
        add(grid);
    }
}
