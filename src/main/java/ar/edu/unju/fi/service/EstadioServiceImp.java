package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.repository.IEstadio;
/**
 * 
 * @author Damian Merlos
 *Esta clase implementa el servicio IEstadioService
 */

@Repository
// Esta clase se conecta con la bd.
public class EstadioServiceImp implements IEstadioService {
	
	@Autowired
	private IEstadio iestadio;
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		iestadio.Guardar();

	}

	@Override
	public Estadio mostrar() {
		// TODO Auto-generated method stub
		Estadio estadio = iestadio.mostrar();
		return estadio;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iestadio.eliminar();

	}

	@Override
	public Estadio modificar() {
		// TODO Auto-generated method stub
		Estadio estadio = iestadio.modificar();
		return estadio;
	}

}
