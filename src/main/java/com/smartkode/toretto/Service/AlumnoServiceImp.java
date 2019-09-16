package com.smartkode.toretto.Service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartkode.toretto.DAO.AlumnoDAO;
import com.smartkode.toretto.entidad.Alumno;

@Service
public class AlumnoServiceImp implements AlumnoService{
	
	private AlumnoDAO alumno;
	@Autowired   
	 public void setAlumnoDAO(AlumnoDAO alumno) {
	        this.alumno = alumno;
	    }
	@Override
	@Transactional
    public void addAlumno(Alumno a1) 
	{        
		this.alumno.addAlumno(a1); 
		
	}
    

}
