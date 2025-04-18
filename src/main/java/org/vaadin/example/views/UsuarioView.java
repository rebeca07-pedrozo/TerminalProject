package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Usuario;
import org.vaadin.example.UsuarioRepository;

@Route("usuarios")
public class UsuarioView extends VerticalLayout {

    private final UsuarioRepository usuarioRepository;

    public UsuarioView(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;

        Grid<Usuario> grid = new Grid<>(Usuario.class);
        grid.setItems(usuarioRepository.findAll());
        grid.removeColumnByKey("contrasena"); // No mostrar contraseña
        add(new H1("Lista de Usuarios"), grid);
    }
}
