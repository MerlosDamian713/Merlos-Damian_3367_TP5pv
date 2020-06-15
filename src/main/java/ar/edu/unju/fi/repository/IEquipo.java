package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Equipo;
/**
 * 
 * @author Damian Merlos
 *Interfaz ICuota, esta clase contiene metodos que se van a aplicar a la clase Equipo.
 */

public interface IEquipo {
	
	public void Guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();

}
