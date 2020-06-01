package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;

/**
 * Clase que va a implementar la interface IEquipoService.
 * 
 * @author Marcia Velarde
 *
 */
@Repository
public class EquipoServiceImp implements IEquipoService {

	// Inyección de un objeto implementador de la clase IUsuario para la conexión
	// con la capa repository
	@Autowired
	private IEquipo iequipo;

	@Override
	public void guardar() {
		// Acción ejecutada para implementar el metodo guardar()
		iequipo.guardar();
	}

	@Override
	public Equipo mostrar() {
		// Acción ejecutada para implementar el metodo mostrar()
		Equipo equipo = iequipo.mostrar();
		return equipo;
	}

	@Override
	public void eliminar() {
		// Acción ejecutada para implementar el metodo eliminar()
		iequipo.eliminar();
	}

	@Override
	public Equipo modificar() {
		// Acción ejecutada para implementar el metodo modificar()
		Equipo equipo = iequipo.modificar();
		return equipo;
	}

}
