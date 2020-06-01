package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

/**
 * Clase que se encargada de tomar las peticiones y controlar que respuesta debe
 * ser presentada en la vista (página html) de nuestro proyecto.
 * 
 * @author Marcia Velarde
 *
 */
//La anotacion indica que la clase es un bean controlador 
@Controller
public class MainController {

	@Autowired
	// Declaramos una variable de tipo IUsuarioServie para poder solicitar algún
	// servicio como mostrar los datos del objeto usuario.
	private IUsuarioService usuarioService;

	// Usamos esta anotacion para asociar una URL
	@RequestMapping("/index.html")
	public String main(Model model) {
		// El objeto model es usado para adjuntar atributos que irán directo a la vista
		// (html), en este ejemplo se envía el nombre del usuario (obtenido utilizando
		// el service usuarioService).
		model.addAttribute("usuario", usuarioService.mostrar().getNombre());
		return "index";
	}

	// Usamos esta anotacion para asociar una URL
	@RequestMapping("/fixture.html")
	public String fixture(Model model) {
		// El objeto model es usado para adjuntar atributos que irán directo a la vista
		// (html), en este ejemplo se envía el nombre del usuario (obtenido utilizando
		// el service usuarioService).
		model.addAttribute("usuario", usuarioService.mostrar().getNombre());
		return "fixture";
	}

	// Usamos esta anotacion para asociar una URL
	@RequestMapping("/equipos.html")
	public String equipos(Model model) {
		// El objeto model es usado para adjuntar atributos que irán directo a la vista
		// (html), en este ejemplo se envía el nombre del usuario (obtenido utilizando
		// el service usuarioService).
		model.addAttribute("usuario", usuarioService.mostrar().getNombre());
		return "equipos";
	}

}
