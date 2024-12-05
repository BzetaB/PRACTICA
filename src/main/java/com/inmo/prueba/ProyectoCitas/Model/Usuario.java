package com.inmo.prueba.ProyectoCitas.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol rol;

    public Rol getRol() {
        return rol;
    }
}
