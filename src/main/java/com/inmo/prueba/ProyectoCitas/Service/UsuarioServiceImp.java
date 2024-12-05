package com.inmo.prueba.ProyectoCitas.Service;

import com.inmo.prueba.ProyectoCitas.Model.Usuario;
import com.inmo.prueba.ProyectoCitas.Repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioServiceImp implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorId(Integer idusuario) {
        return usuarioRepository.findById(idusuario).orElse(null);
    }
}
