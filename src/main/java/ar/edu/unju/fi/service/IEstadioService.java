package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Estadio;
/**
 * 
 * @author Damian Merlos
 *Interfaz IEstadioService, este servicio tiene los metodos de la clase IEstadio.
 */

public interface IEstadioService {
	
	public void Guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();

}
