package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.unju.fi.service.IUsuarioService;
/**
 * 
 * @author Damian Merlos
 *
 */

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	//Inyecta la dependencia hacia el servicio IUsuarioService.
	private IUsuarioService usuarioService;
	
	@GetMapping("Index")
	public String main(Model model) {
		// TODO Auto-generated method stub
		//PROFE NO SE QUE ERROR OCURRE AQUI PERO NO ME TOMA EL NOMBRE DEL USUARIO.
		model.addAttribute("usuario", usuarioService.mostrar().getNombreUsuario());
		return "Index";
	}

}
