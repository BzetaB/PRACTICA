package com.inmo.prueba.ProyectoCitas.Repository;

import com.inmo.prueba.ProyectoCitas.Model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer> {
}
