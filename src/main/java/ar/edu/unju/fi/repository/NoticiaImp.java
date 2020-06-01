package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Velarde3878Tp5Application;
import ar.edu.unju.fi.model.Noticia;

/**
 * Clase que implementará los métodos de la interface INoticia.
 * 
 * @author Marcia Velarde
 *
 */
//Esta anotación está indicando que se trata de un bean de Spring que se encargará de manipular los datos 
//almacenados en algún repositorio
@Repository("noticiaImp")
public class NoticiaImp implements INoticia {

	// Realizaremos la inyeccion de los bean necesarios para usar un objeto de tipo
	// Noticia
	@Autowired
	private Noticia noticia;

	// Vamos a utilizar una variable estática que funcionará para simular las
	// acciones de los métodos. Utilizaremos la librería de trazas de Log, Log4j que
	// fue incorporada entre las dependencias que descargó maven para nuestro
	// proyecto.
	public static Logger LOG = LoggerFactory.getLogger(Velarde3878Tp5Application.class);

	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto Noticia en la BD
		LOG.info("La noticia fue guardada " + noticia.getFecha() + ", " + noticia.getTitulo());
	}

	@Override
	public Noticia mostrar() {
		// Se recuperan todos los datos de la noticia
		LOG.info("Mostrar los datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto Noticia de la red
		LOG.info("Se elimino los datos de la noticia");
	}

	@Override
	public Noticia modificar() {
		// Se modifican los datos de la noticia
		LOG.info("Mostrar los datos de la noticia modificada");
		return noticia;
	}

}
