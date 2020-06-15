package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;
/**
 * 
 * @author Damian Merlos
 *Esta clase implementa el servicio IEquipoService
 */
@Repository
//Esta clase se conecta a la bd.
public class EquipoServiceImp implements IEquipoService {
	
	@Autowired
	private IEquipo iequipo;
	
	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		iequipo.Guardar();

	}

	@Override
	public Equipo mostrar() {
		// TODO Auto-generated method stub
		Equipo equipo = iequipo.mostrar();
		return equipo;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iequipo.eliminar();

	}

	@Override
	public Equipo modificar() {
		// TODO Auto-generated method stub
		Equipo equipo = iequipo.modificar();
		return equipo;
	}

}
