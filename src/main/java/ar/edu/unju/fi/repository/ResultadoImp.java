package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Merlos3367Tp5Application;
import ar.edu.unju.fi.model.Resultado;
/**
 * 
 * @author Damian Merlos
 *esta clase implementara los metodos de la interfaz IResultado.
 */


@Repository("resultadoImp")
public class ResultadoImp implements IResultado {
	
	@Autowired
	private Resultado resultado;
	public static Logger LOG = LoggerFactory.getLogger(Merlos3367Tp5Application.class);
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("El resultado fue guardado: " + resultado.getGolesEquipo1() + ", " + resultado.getGolesEquipo2());

	}

	@Override
	public Resultado mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos del resultado.");
		return resultado;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se eliminó el resultado de la BD.");

	}

	@Override
	public Resultado modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
