package com.smartkode.toretto.entidad;
import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "pelicula")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Pelicula  {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "año")
    private Long año;
    @Column(name = "parte_historia")
    private String parte_historia;
    @Id
    @Column(name = "No_pelicula")
    private Long No_pelicula;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getAño() {
		return año;
	}


	public void setAño(Long año) {
		this.año = año;
	}


	public String getParte_historia() {
		return parte_historia;
	}


	public void setParte_historia(String parte_historia) {
		this.parte_historia = parte_historia;
	}


	public Long getNo_pelicula() {
		return No_pelicula;
	}


	public void setNo_pelicula(Long no_pelicula) {
		No_pelicula = no_pelicula;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    


}