package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Velarde3878Tp5Application;
import ar.edu.unju.fi.model.Resultado;

/**
 * Clase que implementará los métodos de la interface IResultado.
 * 
 * @author Marcia Velarde
 *
 */
//Esta anotación está indicando que se trata de un bean de Spring que se encargará de manipular los datos 
//almacenados en algún repositorio
@Repository("resultadoImp")
public class ResultadoImp implements IResultado {

	// Realizaremos la inyeccion de los bean necesarios para usar un objeto de tipo
	// Resultado
	@Autowired
	private Resultado resultado;

	// Vamos a utilizar una variable estática que funcionará para simular las
	// acciones de los métodos. Utilizaremos la librería de trazas de Log, Log4j que
	// fue incorporada entre las dependencias que descargó maven para nuestro
	// proyecto.
	public static Logger LOG = LoggerFactory.getLogger(Velarde3878Tp5Application.class);

	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto Resultado en la BD
		LOG.info("El resultado fue guardado " + resultado.getEquipo1().getNombre() + " " + resultado.getGolesEquipo1()
				+ " - " + resultado.getEquipo2().getNombre() + " " + resultado.getGolesEquipo2());
	}

	@Override
	public Resultado mostrar() {
		// Se recuperan todos los datos del resultado de un partido
		LOG.info("Mostrar los datos del resultado del partido");
		return resultado;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto Resultado de la red
		LOG.info("Se elimino los datos del resultado del partido");
	}

	@Override
	public Resultado modificar() {
		// Se modifican los datos del resultado de un partido
		LOG.info("Mostrar los datos del resultado del partido modificado");
		return resultado;
	}

}
