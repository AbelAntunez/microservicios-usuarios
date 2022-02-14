package com.curso.microservicios.app.usuarios.services;

import com.curso.microservicios.commons.alumnos.models.entity.Alumno;
import com.curso.microservicios.commons.services.CommonService;
import java.util.List;

public interface AlumnoService extends CommonService<Alumno> {

  List<Alumno> findByNombreOrApellido(String arg);
}
