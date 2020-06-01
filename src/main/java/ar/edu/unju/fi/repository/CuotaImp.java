package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Velarde3878Tp5Application;
import ar.edu.unju.fi.model.Cuota;

/**
 * Clase que implementará los métodos de la interface ICuota.
 * 
 * @author Marcia Velarde
 *
 */
//Esta anotación está indicando que se trata de un bean de Spring que se encargará de manipular los datos 
//almacenados en algún repositorio
@Repository("cuotaImp")
public class CuotaImp implements ICuota {

	// Realizaremos la inyeccion de los bean necesarios para usar un objeto de tipo
	// Cuota
	@Autowired
	private Cuota cuota;

	// Vamos a utilizar una variable estática que funcionará para simular las
	// acciones de los métodos. Utilizaremos la librería de trazas de Log, Log4j que
	// fue incorporada entre las dependencias que descargó maven para nuestro
	// proyecto.
	public static Logger LOG = LoggerFactory.getLogger(Velarde3878Tp5Application.class);

	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto Cuota en la BD
		LOG.info(
				"La cuota fue guardada Periodo: " + cuota.getPeriodo() + ", " + cuota.getEstado() + " ID Socio: " + cuota.getUsuario().getId());

	}

	@Override
	public Cuota mostrar() {
		// Se recuperan todos los datos de la cuota
		LOG.info("Mostrar los datos de la cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto Cuota de la red
		LOG.info("Se elimino los datos de la cuota");
	}

	@Override
	public Cuota modificar() {
		// Se modifican los datos de la cuota
		LOG.info("Mostar los datos de la cuota modificada");
		return cuota;
	}

}
