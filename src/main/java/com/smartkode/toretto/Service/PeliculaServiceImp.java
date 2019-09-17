package com.smartkode.toretto.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartkode.toretto.DAO.PeliculaDAO;
import com.smartkode.toretto.entidad.Pelicula;

@Service
public class PeliculaServiceImp implements PeliculaService{
	
	private PeliculaDAO alumno;
	@Autowired   
	 public void setPeliculaDAO(PeliculaDAO alumno) {
	        this.alumno = alumno;
	    }
	@Override
	@Transactional
    public void addPelicula(Pelicula a1) 
	{        
		this.alumno.addPelicula(a1); 
		
	}
	public void updatePelicula(Pelicula a1) 
	{        
		this.alumno.updatePelicula(a1); 
		
	}
	@Override    
	@Transactional    
	public Pelicula getPeliculaById(long id) 
	{        
		return this.alumno.getPeliculaById(id);    
	}
	@Override    
	@Transactional 
	public List<Pelicula> listPelicula()
	{
	return this.alumno.listPelicula();
	}
	
	public void eliminarPelicula(Pelicula p)
	{
	this.alumno.eliminarPelicula(p);	
	}
}
