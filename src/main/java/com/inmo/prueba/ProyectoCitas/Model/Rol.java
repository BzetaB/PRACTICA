package com.inmo.prueba.ProyectoCitas.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrol;
    private String nombrerol;

    public String getNombrerol() {
        return nombrerol;
    }
}
