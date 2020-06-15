package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

/**
 * 
 * @author Damian Merlos
 * Interface IUsuarioService, contiene los metodos que se pueden aplicar a la clase Usuario.
 *
 */

public interface IUsuarioService {
	
	public void guardar();
	public 	Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

}
