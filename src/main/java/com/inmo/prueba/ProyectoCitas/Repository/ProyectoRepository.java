package com.inmo.prueba.ProyectoCitas.Repository;

import com.inmo.prueba.ProyectoCitas.Model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
}
