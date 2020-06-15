package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Equipo;

public interface IEquipoService {
	
	public void Guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();

}
