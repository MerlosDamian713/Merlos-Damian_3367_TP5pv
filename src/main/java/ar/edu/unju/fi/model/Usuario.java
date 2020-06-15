package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
/**
 * 
 * @author Damian Merlos
 *Esta clase usuario representa a un usuario.
 */
@Component
//Clase component bean administrado
public class Usuario {
	
	//Atributo de tipo long que contiene la clave principal del usuario.
	private long idUsuario;
	//Atributo de tipo cadena que guarda el nombre del usuario.
	private String nombreUsuario;
	//Atributo de tipo cadena que guarda el apellido del usuario.
	private String apellidoUsuario;
	//Atributo de tipo fecha que guarda la fecha de nacimiento del usuario.
	private LocalDate fechaNacimientoUsuario;
	//Atributo de tipo cadena que guarda la dirección del usuario.
	private String direccionUsuario;
	//Atributo de tipo long que contien el número de documento del usuario.
	private long dniUsuario;
	//Atributo de tipo fecha que guarda la fecha en la que el usario fue dado de alta.
	private LocalDate fechaAltaUsuario;
	//Atributo de tipo cadena que guarda el tipo del usuario.
	private String tipoUsuario;
	//Atributo de tipo cadena que guarda la contraseña del usuario.
	private String password;
	
	
	/**
	 * constructor por defecto
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor parammetrizado.
	 * @param idUsuario
	 * @param nombreUsuario
	 * @param apellidoUsuario
	 * @param fechaNacimientoUsuario
	 * @param direccionUsuario
	 * @param dniUsuario
	 * @param fechaAltaUsuario
	 * @param tipoUsuario
	 * @param password
	 */
	public Usuario(long idUsuario, String nombreUsuario, String apellidoUsuario, LocalDate fechaNacimientoUsuario,
			String direccionUsuario, long dniUsuario, LocalDate fechaAltaUsuario, String tipoUsuario, String password) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.fechaNacimientoUsuario = fechaNacimientoUsuario;
		this.direccionUsuario = direccionUsuario;
		this.dniUsuario = dniUsuario;
		this.fechaAltaUsuario = fechaAltaUsuario;
		this.tipoUsuario = tipoUsuario;
		this.password = password;
	}

	/**
	 * @return the idUsuario
	 */
	public long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the apellidoUsuario
	 */
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	/**
	 * @param apellidoUsuario the apellidoUsuario to set
	 */
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	/**
	 * @return the fechaNacimientoUsuario
	 */
	public LocalDate getFechaNacimientoUsuario() {
		return fechaNacimientoUsuario;
	}

	/**
	 * @param fechaNacimientoUsuario the fechaNacimientoUsuario to set
	 */
	public void setFechaNacimientoUsuario(LocalDate fechaNacimientoUsuario) {
		this.fechaNacimientoUsuario = fechaNacimientoUsuario;
	}

	/**
	 * @return the direccionUsuario
	 */
	public String getDireccionUsuario() {
		return direccionUsuario;
	}

	/**
	 * @param direccionUsuario the direccionUsuario to set
	 */
	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}

	/**
	 * @return the dniUsuario
	 */
	public long getDniUsuario() {
		return dniUsuario;
	}

	/**
	 * @param string the dniUsuario to set
	 */
	public void setDniUsuario (long dniUsuario) {
		this.dniUsuario = dniUsuario ;
	}

	/**
	 * @return the fechaAltaUsuario
	 */
	public LocalDate getFechaAltaUsuario() {
		return fechaAltaUsuario;
	}

	/**
	 * @param fechaAltaUsuario the fechaAltaUsuario to set
	 */
	public void setFechaAltaUsuario(LocalDate fechaAltaUsuario) {
		this.fechaAltaUsuario = fechaAltaUsuario;
	}

	/**
	 * @return the tipoUsuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	/**
	 * Metodo toString, este metodo muestra los atruibutos en forma de cadena cuando se es invocado.
	 */
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario="
				+ apellidoUsuario + ", fechaNacimientoUsuario=" + fechaNacimientoUsuario + ", direccionUsuario="
				+ direccionUsuario + ", dniUsuario=" + dniUsuario + ", fechaAltaUsuario=" + fechaAltaUsuario
				+ ", tipoUsuario=" + tipoUsuario + ", password=" + password + "]";
	}

}
