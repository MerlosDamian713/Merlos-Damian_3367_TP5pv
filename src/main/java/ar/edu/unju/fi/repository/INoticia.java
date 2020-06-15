package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;
/**
 * 
 * @author Damian Merlos
 *Interfaz INoticia, esta clase contiene metodos que se van a aplicar a la clase Noticia.
 */

public interface INoticia {
	
	public void Guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();

}
