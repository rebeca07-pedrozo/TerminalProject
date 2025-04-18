package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Clases.EstadisticaAforo;
import org.vaadin.example.Repository.EstadisticaAforoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route("estadisticas-aforo")
public class EstadisticasAforoView extends VerticalLayout {

    private final EstadisticaAforoRepository estadisticaAforoRepository;
    private final Grid<EstadisticaAforo> grid = new Grid<>(EstadisticaAforo.class);

    @Autowired
    public EstadisticasAforoView(EstadisticaAforoRepository estadisticaAforoRepository) {
        this.estadisticaAforoRepository = estadisticaAforoRepository;
        grid.setItems(estadisticaAforoRepository.findAll());
        add(grid);
    }
}
