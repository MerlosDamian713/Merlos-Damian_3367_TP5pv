package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Merlos3367Tp5Application implements CommandLineRunner {
	
	@Autowired
	//Inyeccion dependencia hacia el servicio IUsuarioService.
	IUsuarioService usuarioService;
	@Autowired
	//Inyeccion de dependencia hacia la clase Usuario.
	Usuario usuario;
	

	public static void main(String[] args) {
		SpringApplication.run(Merlos3367Tp5Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//inicializamos las variables que posee el objeto usuario.
		usuario.setApellidoUsuario("Moreno");
		usuario.setDireccionUsuario("calle catamarca 119");
		usuario.setDniUsuario(34343443);
		usuario.setFechaNacimientoUsuario(LocalDate.of(1997, 01, 26));
		usuario.setFechaAltaUsuario(LocalDate.now());
		usuario.setIdUsuario(1);
		usuario.setNombreUsuario("juan");
		usuario.setPassword("contraseña");
		usuario.setTipoUsuario("SOCIO");
		usuarioService.guardar();
		
		
	}
	

}
