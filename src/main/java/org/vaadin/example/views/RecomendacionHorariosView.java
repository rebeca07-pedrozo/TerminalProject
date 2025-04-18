package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Clases.RecomendacionHorario;
import org.vaadin.example.Repository.RecomendacionHorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route("recomendaciones-horarios")
public class RecomendacionHorariosView extends VerticalLayout {

    private final RecomendacionHorarioRepository recomendacionHorarioRepository;
    private final Grid<RecomendacionHorario> grid = new Grid<>(RecomendacionHorario.class);

    @Autowired
    public RecomendacionHorariosView(RecomendacionHorarioRepository recomendacionHorarioRepository) {
        this.recomendacionHorarioRepository = recomendacionHorarioRepository;
        grid.setItems(recomendacionHorarioRepository.findAll());
        add(grid);
    }
}
