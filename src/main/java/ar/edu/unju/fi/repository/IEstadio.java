package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;
/**
 * 
 * @author Damian Merlos
 *Interfaz ICuota, esta clase contiene metodos que se van a aplicar a la clase Estadio.
 */

public interface IEstadio {
	
	public void Guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();

}
