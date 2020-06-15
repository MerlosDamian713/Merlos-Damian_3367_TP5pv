package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;
/**
 * 
 * @author Damian Merlos
 *Esta Interfaz contiene metodos que se van a aplicar a la clase Resultado.
 */

public interface IResultado {
	
	public void Guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
