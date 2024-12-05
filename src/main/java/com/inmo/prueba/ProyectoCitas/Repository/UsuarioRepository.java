package com.inmo.prueba.ProyectoCitas.Repository;

import com.inmo.prueba.ProyectoCitas.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
