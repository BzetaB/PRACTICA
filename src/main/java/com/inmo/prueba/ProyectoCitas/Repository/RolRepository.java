package com.inmo.prueba.ProyectoCitas.Repository;

import com.inmo.prueba.ProyectoCitas.Model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}
