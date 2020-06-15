package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;
/**
 * 
 * @author Damian Merlos
 *Interfaz ICuota, esta clase contiene metodos que se van a aplicar a la clase Cuota.
 */

public interface ICuota {
	
	public void Guardar();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();

}
