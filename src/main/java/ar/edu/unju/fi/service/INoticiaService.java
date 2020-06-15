package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Noticia;

/**
 * 
 * @author Damian Merlos
 *La Interfaz INoticiaService, es un servicio contiene metodos que se aplican a la clase Noticia.
 */

public interface INoticiaService {
	
	public void Guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();

}
