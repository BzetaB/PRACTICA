package com.inmo.prueba.ProyectoCitas.Service;

import com.inmo.prueba.ProyectoCitas.Model.Cita;
import com.inmo.prueba.ProyectoCitas.Model.Usuario;
import com.inmo.prueba.ProyectoCitas.Repository.CitaRepository;
import com.inmo.prueba.ProyectoCitas.Repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaServiceImp implements CitaService {


    private final CitaRepository citaRepository;
    public CitaServiceImp(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Override
    public Cita crearCitaCliente(Usuario usuario, Cita cita) {


        if (usuario.getRol() == null ||!usuario.getRol().getNombrerol().equalsIgnoreCase("CLIENTE"))
            throw new IllegalArgumentException("El usuario no tiene rol de cliente");

        return citaRepository.save(cita);
    }
}
