package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Velarde3878Tp5Application;
import ar.edu.unju.fi.model.Equipo;

/**
 * Clase que implementará los métodos de la interface IEquipo.
 * 
 * @author Marcia Velarde
 *
 */
//Esta anotación está indicando que se trata de un bean de Spring que se encargará de manipular los datos 
//almacenados en algún repositorio
@Repository("equipoImp")
public class EquipoImp implements IEquipo {

	// Realizaremos la inyeccion de los bean necesarios para usar un objeto de tipo Equipo  
	@Autowired
	private Equipo equipo;

	// Vamos a utilizar una variable estática que funcionará para simular las
	// acciones de los métodos. Utilizaremos la librería de trazas de Log, Log4j que
	// fue incorporada entre las dependencias que descargó maven para nuestro
	// proyecto.
	public static Logger LOG = LoggerFactory.getLogger(Velarde3878Tp5Application.class);

	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto Equipo en la BD
		LOG.info("El equipo fue guardado " + equipo.getNombre() + ", " + equipo.getEstadio());
	}

	@Override
	public Equipo mostrar() {
		// Se recuperan todos los datos del equipo
		LOG.info("Mostrar datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto Equipo de la red
		LOG.info("Se elimino los datos del equipo");
	}

	@Override
	public Equipo modificar() {
		// Se modifican los datos del equipo
		LOG.info("Mostrar los datos del equipo modificado");
		return equipo;
	}

}
