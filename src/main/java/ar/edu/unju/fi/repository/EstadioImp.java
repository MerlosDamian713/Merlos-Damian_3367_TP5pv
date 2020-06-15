package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Merlos3367Tp5Application;
import ar.edu.unju.fi.model.Estadio;
/**
 * 
 * @author Damian Merlos
 *Esta clase implementara los metodos de la interfaz IEstadio.
 */

@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	
	private Estadio estadio;

	public static Logger LOG = LoggerFactory.getLogger(Merlos3367Tp5Application.class);
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("El estadio fue guardado: " + estadio.getNombreEstadio() + ", " + estadio.getDireccionEstadio());

	}

	@Override
	public Estadio mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos del estadio.");
		return estadio;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se eliminó el estadio de la BD.");
	}

	@Override
	public Estadio modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
