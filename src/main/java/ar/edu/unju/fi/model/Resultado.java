package ar.edu.unju.fi.model;

import java.time.LocalDate;
/**
 * @author Damian Merlos
 * Clase Resultado
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
//Clase bean administrada Resultado
public class Resultado {
	
	//Atributo de tipo fecha que guarda la fecha del resultado.
	private LocalDate fechaResultado;
	@Autowired
	//Inyección de dependencia hacia un objeto tipo Equipo.
	//Atributo de tipo Equipo que contiene información del primero equipo.
	private Equipo equipo1;
		
	@Autowired
	//Inyección de dependencia hacia un objeto tipo Equipo.
	//Atributo de tipo Equipo que contiene información del segundo equipo.
	private Equipo equipo2;
	//Atributo de tipo entero que guarda la cantidad de goles hechas por el primer equipo durante el partido.
	private int golesEquipo1;
	//Atributo de tipo entero que guarda la cantidad de goles hechas por el segundo equipo durante el partido.
	private int golesEquipo2;
	
	/**
	 * constructor por defecto
	 */
	public Resultado() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Constructor parametrizado.
	 * @param fechaResultado
	 * @param equipo1
	 * @param equipo2
	 * @param golesEquipo1
	 * @param golesEquipo2
	 */
	public Resultado(LocalDate fechaResultado, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.fechaResultado = fechaResultado;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}


	/**
	 * @return the fechaResultado
	 */
	public LocalDate getFechaResultado() {
		return fechaResultado;
	}


	/**
	 * @param fechaResultado the fechaResultado to set
	 */
	public void setFechaResultado(LocalDate fechaResultado) {
		this.fechaResultado = fechaResultado;
	}


	/**
	 * @return the equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}


	/**
	 * @param equipo1 the equipo1 to set
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}


	/**
	 * @return the equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}


	/**
	 * @param equipo2 the equipo2 to set
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}


	/**
	 * @return the golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}


	/**
	 * @param golesEquipo1 the golesEquipo1 to set
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}


	/**
	 * @return the golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}


	/**
	 * @param golesEquipo2 the golesEquipo2 to set
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
	
	@Override
	/**
	 * Metodo toString, este metodo muestra los atruibutos en forma de cadena cuando se es invocado.
	 */
	public String toString() {
		return "Resultado [fechaResultado=" + fechaResultado + ", equipo1=" + equipo1 + ", equipo2=" + equipo2
				+ ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}
	
}
