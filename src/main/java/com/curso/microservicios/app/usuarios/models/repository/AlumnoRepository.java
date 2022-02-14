package com.curso.microservicios.app.usuarios.models.repository;

import com.curso.microservicios.commons.alumnos.models.entity.Alumno;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Long> {

  @Query("select a from Alumno a where a.nombre like %?1% or a.apellido like %?1%")
  List<Alumno> findByNombreOrApellido(String arg);
}
