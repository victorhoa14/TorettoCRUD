package com.smartkode.toretto.Service;

import java.util.List;

import com.smartkode.toretto.entidad.Pelicula;

public interface PeliculaService {
	public void addPelicula(Pelicula p);
	public void updatePelicula(Pelicula p);
	public Pelicula getPeliculaById(long id);
	public List<Pelicula> listPelicula();
	public void eliminarPelicula(Pelicula p);
}
