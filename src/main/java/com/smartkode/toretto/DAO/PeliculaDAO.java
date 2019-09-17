package com.smartkode.toretto.DAO;

import java.util.List;


import com.smartkode.toretto.entidad.Pelicula;


public interface PeliculaDAO {
	
	public void addPelicula(Pelicula p);
	public void updatePelicula(Pelicula p);
	public Pelicula getPeliculaById(long id);
	public List<Pelicula> listPelicula();
	public void eliminarPelicula(Pelicula p);


}