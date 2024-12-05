package com.inmo.prueba.ProyectoCitas.Service;

import com.inmo.prueba.ProyectoCitas.Model.Cita;
import com.inmo.prueba.ProyectoCitas.Model.Usuario;

public interface CitaService {
        Cita crearCitaCliente(Usuario usuario, Cita cita);
}
