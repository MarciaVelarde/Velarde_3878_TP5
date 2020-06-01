package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.repository.ICuota;
/**
 * Clase que va a implementar la interface ICuotaService.
 * 
 * @author Marcia Velarde
 *
 */
@Repository
public class CuotaServiceImp implements ICuotaService {

	// Inyección de un objeto implementador de la clase IUsuario para la conexión
	// con la capa repository
	@Autowired
	private ICuota icuota;

	@Override
	public void guardar() {
		// Acción ejecutada para implementar el metodo guardar()
		icuota.guardar();
	}

	@Override
	public Cuota mostrar() {
		// Acción ejecutada para implementar el metodo mostrar()
		Cuota cuota = icuota.mostrar();
		return cuota;
	}

	@Override
	public void eliminar() {
		// Acción ejecutada para implementar el metodo eliminar()
		icuota.eliminar();
	}

	@Override
	public Cuota modificar() {
		// Acción ejecutada para implementar el metodo modificar()
		Cuota cuota = icuota.modificar();
		return cuota;
	}

}
