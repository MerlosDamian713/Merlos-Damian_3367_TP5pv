package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * 
 * @author Damian Merlos
 *Clase Noticia
 */
@Component
//Clase bean administrada.
public class Noticia {
	
	//Atributo de tipo fecha que contiene la fecha de una noticia.
	private LocalDate fechaNoticia;
	//Atributo tipo cadena que contiene el titulo de una noticia.
	private String tituloNoticia;
	//Atributo tipo cadena que contiene un resumen de una noticia.
	private String resumenNoticia;
		
	/**
	 * Constructor por defecto.
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * Constructor parametrizado.
	 * @param fechaNoticia
	 * @param tituloNoticia
	 * @param resumenNoticia
	 */
	public Noticia(LocalDate fechaNoticia, String tituloNoticia, String resumenNoticia) {
		this.fechaNoticia = fechaNoticia;
		this.tituloNoticia = tituloNoticia;
		this.resumenNoticia = resumenNoticia;
	}
		

	/**
	 * @return the fechaNoticia
	 */
	public LocalDate getFechaNoticia() {
		return fechaNoticia;
	}

	/**
	 * @param fechaNoticia the fechaNoticia to set
	 */
	public void setFechaNoticia(LocalDate fechaNoticia) {
		this.fechaNoticia = fechaNoticia;
	}

	/**
	 * @return the tituloNoticia
	 */
	public String getTituloNoticia() {
		return tituloNoticia;
	}

	/**
	 * @param tituloNoticia the tituloNoticia to set
	 */
	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}

	/**
	 * @return the resumenNoticia
	 */
	public String getResumenNoticia() {
		return resumenNoticia;
	}

	/**
	 * @param resumenNoticia the resumenNoticia to set
	 */
	public void setResumenNoticia(String resumenNoticia) {
		this.resumenNoticia = resumenNoticia;
	}
		
	@Override
	/**
	 * Metodo toString, este metodo muestra los atruibutos en forma de cadena cuando se es invocado.
	 */
	public String toString() {
		return "Noticia [fechaNoticia=" + fechaNoticia + ", tituloNoticia=" + tituloNoticia + ", resumenNoticia="
				+ resumenNoticia + "]";
	}
		

}
