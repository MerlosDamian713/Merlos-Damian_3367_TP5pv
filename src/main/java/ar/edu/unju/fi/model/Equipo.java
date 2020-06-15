package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Damian Merlos
 *Clase equipo.
 */
@Component
//Clase Bean administrado Equipo.
public class Equipo {
	
	//Atributo que guarda el nombre de un equipo.
	private String nombre;
	@Autowired
	//Inyeccion de dependencia hacia el objeto de tipo estadio.
	//Atributo de tipo estadio.
	private Estadio estadio;
	
	
	/**
	 * Costructor por defecto.
	 */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor parametrisado
	 * @param estadio, parametro estadio.
	 * @param nombre, parametro nombre.
	 */
	public Equipo (String nombre, Estadio estadio) {
		super();
		this.estadio = estadio;
		this.nombre = nombre;
	}
	
	
	
	
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}


	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	@Override
	/**
	 * Metodo toString, este metodo muestra los atruibutos en forma de cadena cuando se es invocado.
	 */
	public String toString () {
		return "ProcesoString [nombre= " + nombre + ", estadio= " + estadio +"]";
	}
	
}
