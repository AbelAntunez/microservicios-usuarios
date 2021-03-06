package com.curso.microservicios.app.usuarios.services;

import com.curso.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.curso.microservicios.commons.alumnos.models.entity.Alumno;
import com.curso.microservicios.commons.services.CommonServiceImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{


  @Override
  @Transactional(readOnly = true)
  public List<Alumno> findByNombreOrApellido(String arg) {
    return repository.findByNombreOrApellido(arg);
  }
}
