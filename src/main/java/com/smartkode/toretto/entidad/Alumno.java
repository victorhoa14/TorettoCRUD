package com.smartkode.toretto.entidad;
import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "alumno")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Alumno  {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Id
    @Column(name = "matricula")
    private Long matricula;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    


}