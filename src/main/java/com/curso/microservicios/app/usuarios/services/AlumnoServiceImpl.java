package com.curso.microservicios.app.usuarios.services;

import com.curso.microservicios.app.usuarios.models.entity.Alumno;
import com.curso.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.curso.microservicios.commons.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{


}
