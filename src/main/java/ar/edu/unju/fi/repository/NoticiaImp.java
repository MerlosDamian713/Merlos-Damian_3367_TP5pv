package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Merlos3367Tp5Application;
import ar.edu.unju.fi.model.Noticia;
/**
 * 
 * @author Damian Merlos
 *Esta clase implementara los metodos de la interfaz INoticia.
 */


@Repository("noticiaImp")
public class NoticiaImp implements INoticia {
	
	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Merlos3367Tp5Application.class);
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("La noticia fue guardada: " + noticia.getTituloNoticia() + ", " + noticia.getResumenNoticia());
	}

	@Override
	public Noticia mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de la noticia.");
		return noticia;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se eliminó la noticia de la BD.");

	}

	@Override
	public Noticia modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
