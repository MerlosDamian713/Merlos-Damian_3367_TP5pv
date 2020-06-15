package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Cuota;
/**
 * 
 * @author Damian Merlos
 *Interfaz ICuptaService, este servicio contiene metodos de la clase cuota.
 */

public interface ICuotaService {
	
	public void Guardar();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();


}
