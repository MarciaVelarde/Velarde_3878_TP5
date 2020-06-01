package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Velarde3878Tp5Application;
import ar.edu.unju.fi.model.Estadio;

/**
 * Clase que implementará los métodos de la interface IEstadio.
 * 
 * @author Marcia Velarde
 *
 */
//Esta anotación está indicando que se trata de un bean de Spring que se encargará de manipular los datos 
//almacenados en algún repositorio
@Repository("estadioImp")
public class EstadioImp implements IEstadio {

	// Realizaremos la inyeccion de los bean necesarios para usar un objeto de tipo
	// Estadio
	@Autowired
	private Estadio estadio;

	// Vamos a utilizar una variable estática que funcionará para simular las
	// acciones de los métodos. Utilizaremos la librería de trazas de Log, Log4j que
	// fue incorporada entre las dependencias que descargó maven para nuestro
	// proyecto.
	public static Logger LOG = LoggerFactory.getLogger(Velarde3878Tp5Application.class);

	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto Estadio en la BD
		LOG.info("El estadio fue guardado " + estadio.getNombre());
	}

	@Override
	public Estadio mostrar() {
		// Se recuperan todos los datos del estadio
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto Estadio de la red
		LOG.info("Se elimino los datos del estadio");
	}

	@Override
	public Estadio modificar() {
		// Se modifican los datos del estadio
		LOG.info("Mostrar los datos del estadio modificado");
		return estadio;
	}

}
