package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado;
/**
 * 
 * @author Damian Merlos
 *este servicio contiene los metodos que se van a aplicar en la clase Resultado.
 */

public interface IResultadoService {
	
	public void Guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
