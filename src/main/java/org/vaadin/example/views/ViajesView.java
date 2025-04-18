package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Clases.Viaje;
import org.vaadin.example.Repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route("viajes")
public class ViajesView extends VerticalLayout {

    private final ViajeRepository viajeRepository;
    private final Grid<Viaje> grid = new Grid<>(Viaje.class);

    @Autowired
    public ViajesView(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;

        grid.setItems(viajeRepository.findAll());

        // Puedes ajustar columnas si se ve muy denso
        grid.setColumns("viajeId", "terminalOrigen", "terminalDestino", "fechaSalida", "fechaLlegada", "disponibilidad", "precio");

        add(new H1("Lista de Viajes"), grid);
    }
}
