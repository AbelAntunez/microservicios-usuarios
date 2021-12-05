package com.curso.microservicios.app.usuarios.models.repository;

import com.curso.microservicios.commons.alumnos.models.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
