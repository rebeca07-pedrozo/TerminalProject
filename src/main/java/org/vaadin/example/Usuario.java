package org.vaadin.example;

import jakarta.persistence.*;

import java.security.Timestamp;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuario_id;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String contrasena;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo_usuario;

    @Column(name = "fecha_creacion")
    private Timestamp fechaCreacion;
}
