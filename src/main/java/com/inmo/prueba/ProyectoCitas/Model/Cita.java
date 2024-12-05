package com.inmo.prueba.ProyectoCitas.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcita;
    private LocalDate fecharegistro;
    private String consulta;
    private LocalDate fechaasignacion;
    private LocalDate fechacierre;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idproyecto")
    private Proyecto proyecto;

}
