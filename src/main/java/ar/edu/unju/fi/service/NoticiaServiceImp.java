package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticia;

/**
 * Clase que va a implementar la interface INoticiaService.
 * 
 * @author Marcia Velarde
 *
 */
@Repository
public class NoticiaServiceImp implements INoticiaService {

	// Inyección de un objeto implementador de la clase IUsuario para la conexión
	// con la capa repository
	@Autowired
	private INoticia inoticia;

	@Override
	public void guardar() {
		// Acción ejecutada para implementar el metodo guardar()
		inoticia.guardar();
	}

	@Override
	public Noticia mostrar() {
		// Acción ejecutada para implementar el metodo mostrar()
		Noticia noticia = inoticia.mostrar();
		return noticia;
	}

	@Override
	public void eliminar() {
		// Acción ejecutada para implementar el metodo eliminar()
		inoticia.eliminar();
	}

	@Override
	public Noticia modificar() {
		// Acción ejecutada para implementar el metodo modificar()
		Noticia noticia = inoticia.modificar();
		return noticia;
	}

}
