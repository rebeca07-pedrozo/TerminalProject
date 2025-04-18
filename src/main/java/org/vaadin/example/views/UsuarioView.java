package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Clases.Usuario;
import org.vaadin.example.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route("usuarios")
public class UsuarioView extends VerticalLayout {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioView(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;

        Grid<Usuario> grid = new Grid<>(Usuario.class);
        grid.setItems(usuarioRepository.findAll());

        // Ocultar la contraseña en el Grid
        grid.removeColumnByKey("contrasena");

        add(new H1("Lista de Usuarios"), grid);
    }
}
