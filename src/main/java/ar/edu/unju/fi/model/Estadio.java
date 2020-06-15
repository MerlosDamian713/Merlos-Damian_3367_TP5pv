package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Damian Merlos
 *Clase equipo.
 */
@Component
//Clase Bean administrado Estadio.
public class Estadio  {
	
	//Atributo que guarda el nombre del estadio.
	private String nombreEstadio;
	//Atributo que guarda la fecha de fundacion del estadio.
	private LocalDate fechaFundacionEstadio;
	//Atributo que guarda el nombre de la ciudad donde se encuentra en estadio.
	private String ciudadEstadio;
	//Atributo que guarda la capacidad del estadio.
	private int capacidadEstadio;
	//Atributo que guarda la direccion del estadio.
	private String direccionEstadio;
	
	
	/**
	 * Constructor por defecto.
	 */
	public Estadio() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor parametrizado.
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param direccion
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombreEstadio = nombre;
		this.fechaFundacionEstadio = fechaFundacion;
		this.ciudadEstadio = ciudad;
		this.capacidadEstadio = capacidad;
		this.direccionEstadio = direccion;
	}


	/**
	 * @return the nombreEstadio
	 */
	public String getNombreEstadio() {
		return nombreEstadio;
	}


	/**
	 * @param nombreEstadio the nombreEstadio to set
	 */
	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}


	/**
	 * @return the fechafundacionEstadio
	 */
	public LocalDate getFechaFundacionEstadio() {
		return fechaFundacionEstadio;
	}


	/**
	 * @param fechafundacionEstadio the fechafundacionEstadio to set
	 */
	public void setFechafundacionEstadio(LocalDate fechaFundacionEstadio) {
		this.fechaFundacionEstadio = fechaFundacionEstadio;
	}


	/**
	 * @return the ciudadEstadio
	 */
	public String getCiudadEstadio() {
		return ciudadEstadio;
	}


	/**
	 * @param ciudadEstadio the ciudadEstadio to set
	 */
	public void setCiudadEstadio(String ciudadEstadio) {
		this.ciudadEstadio = ciudadEstadio;
	}


	/**
	 * @return the capacidadEstadio
	 */
	public int getCapacidadEstadio() {
		return capacidadEstadio;
	}


	/**
	 * @param capacidadEstadio the capacidadEstadio to set
	 */
	public void setCapacidadEstadio(int capacidadEstadio) {
		this.capacidadEstadio = capacidadEstadio;
	}


	/**
	 * @return the direccionEstadio
	 */
	public String getDireccionEstadio() {
		return direccionEstadio;
	}


	/**
	 * @param direccionEstadio the direccionEstadio to set
	 */
	public void setDireccionEstadio(String direccionEstadio) {
		this.direccionEstadio = direccionEstadio;
	}
	
	@Override
	/**
	 * Metodo toString, este metodo muestra los atruibutos en forma de cadena cuando se es invocado.
	 */
	public String toString() {
		return "Estadio [nombreEstadio=" + nombreEstadio + ", fechaFundacionEstadio=" + fechaFundacionEstadio
				+ ", ciudadEstadio=" + ciudadEstadio + ", capacidadEstadio=" + capacidadEstadio + ", direccionEstadio="
				+ direccionEstadio + "]";
	}
	

}
