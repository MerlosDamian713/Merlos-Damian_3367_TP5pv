package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Merlos3367Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * 
 * @author Damian Merlos
 * Clase IUsuarioImp que implementara los metodos de la interface IUsuario.
 */

@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {
	
	@Autowired
	private Usuario usuario;

	public static Logger LOG = LoggerFactory.getLogger(Merlos3367Tp5Application.class);

	@Override
	public void Guardar() {
		// TODO Auto-generated method stub
		LOG.info("El usuario fue guardado: " + usuario.getApellidoUsuario() + ", " + usuario.getNombreUsuario());

	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void elminiar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
