package ar.edu.unju.fi.repository;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Merlos3367Tp5Application;
import ar.edu.unju.fi.model.Cuota;

/**
 * 
 * @author Damian Merlos
 *Esta clase implementara los metodos de la interfaz ICuota.
 */

@Repository("cuotaImp")
public class CuotaImp implements ICuota {
	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Merlos3367Tp5Application.class);
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("Cuota guardada: " + cuota.getIdcuota() + ", " + cuota.getMontoCuota());

	}

	@Override
	public Cuota mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de la cuota.");
		return cuota;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se eliminó la cuota de la BD.");

	}

	@Override
	public Cuota modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
