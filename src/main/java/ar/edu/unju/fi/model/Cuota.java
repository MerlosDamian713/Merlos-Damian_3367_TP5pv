package ar.edu.unju.fi.model;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Damian Merlos
 *Clase Cuota.
 */
@Component
public class Cuota {
	
	//Atributo de tipo long que representa a la clase
	private long idCuota;
	//Atributo de tipo fecha que tiene la fecha del pago de la cuota;
	private LocalDate fechaPagoCuota;
	//Atributo de tipo cadena que almacena el periodo de la cuota.
	private String periodoCuota;
	//Atributo de tipo double que almacena el monto de la cuota.
	private double montoCuota;
	//Atributo de tipo cadena que tiene el estado de la cuota.
	private String estadoCuota;
	@Autowired
	//Inyeccion de dependencia hacia el objeto de tipo usuario.
	//Atributo de tipo usuario que pagara la cuota
	private Usuario usuarioCuota;
	
	/**
	 * constructor por defecto
	 */
	public Cuota( ) {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor parametrizado.
	 * @param idCuota
	 * @param fechaPagoCuota
	 * @param periodoCuota
	 * @param montoCuota
	 * @param estadoCuota
	 * @param usuarioCuota
	 */
	public Cuota(long idCuota, LocalDate fechaPagoCuota, String periodoCuota, double montoCuota,
			String estadoCuota, Usuario usuarioCuota) {
		this.idCuota = idCuota;
		this.fechaPagoCuota = fechaPagoCuota;
		this.periodoCuota = periodoCuota;
		this.montoCuota = montoCuota;
		this.estadoCuota = estadoCuota;
		this.usuarioCuota = usuarioCuota;
		
	}
	
	
	

	/**
	 * @return the idcuota
	 */
	public long getIdcuota() {
		return idCuota;
	}

	/**
	 * @param idcuota the idcuota to set
	 */
	public void setIdcuota(long idcuota) {
		this.idCuota = idcuota;
	}

	/**
	 * @return the fechaPagoCuota
	 */
	public LocalDate getFechaPagoCuota() {
		return fechaPagoCuota;
	}

	/**
	 * @param fechaPagoCuota the fechaPagoCuota to set
	 */
	public void setFechaPagoCuota(LocalDate fechaPagoCuota) {
		this.fechaPagoCuota = fechaPagoCuota;
	}

	/**
	 * @return the periodoCuota
	 */
	public String getPeriodoCuota() {
		return periodoCuota;
	}

	/**
	 * @param periodoCuota the periodoCuota to set
	 */
	public void setPeriodoCuota(String periodoCuota) {
		this.periodoCuota = periodoCuota;
	}

	/**
	 * @return the montoCuota
	 */
	public double getMontoCuota() {
		return montoCuota;
	}

	/**
	 * @param montoCuota the montoCuota to set
	 */
	public void setMontoCuota(double montoCuota) {
		this.montoCuota = montoCuota;
	}

	/**
	 * @return the estadoCuota
	 */
	public String getEstadoCuota() {
		return estadoCuota;
	}

	/**
	 * @param estadoCuota the estadoCuota to set
	 */
	public void setEstadoCuota(String estadoCuota) {
		this.estadoCuota = estadoCuota;
	}

	/**
	 * @return the usuarioCuota
	 */
	public Usuario getUsuarioCuota() {
		return usuarioCuota;
	}

	/**
	 * @param usuarioCuota the usuarioCuota to set
	 */
	public void setUsuarioCuota(Usuario usuarioCuota) {
		this.usuarioCuota = usuarioCuota;
	}
	
	public String toString() {
		return "Cuota [idCuota=" + idCuota + ", fechaPagoCuota=" + fechaPagoCuota + ", periodoCuota=" + periodoCuota
				+ ", montoCuota=" + montoCuota + ", estadoCuota=" + estadoCuota + ", usuarioCuota=" + usuarioCuota
				+ "]";
	}
	
	

}
