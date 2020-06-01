package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.repository.IEstadio;

/**
 * Clase que va a implementar la interface IEstadioService.
 * 
 * @author Marcia Velarde
 *
 */
@Repository
public class EstadioServiceImp implements IEstadioService {

	// Inyección de un objeto implementador de la clase IUsuario para la conexión
	// con la capa repository
	@Autowired
	private IEstadio iestadio;

	@Override
	public void guardar() {
		// Acción ejecutada para implementar el metodo guardar()
		iestadio.guardar();
	}

	@Override
	public Estadio mostrar() {
		// Acción ejecutada para implementar el metodo mostrar()
		Estadio estadio = iestadio.mostrar();
		return estadio;
	}

	@Override
	public void eliminar() {
		// Acción ejecutada para implementar el metodo eliminar()
		iestadio.eliminar();
	}

	@Override
	public Estadio modificar() {
		// Acción ejecutada para implementar el metodo modificar()
		Estadio estadio = iestadio.modificar();
		return estadio;
	}

}
