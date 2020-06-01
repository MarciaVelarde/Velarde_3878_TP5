package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.repository.IResultado;

/**
 * Clase que va a implementar la interface IResultadoService.
 * 
 * @author Marcia Velarde
 *
 */
@Repository
public class ResultadoServiceImp implements IResultadoService {

	// Inyección de un objeto implementador de la clase IUsuario para la conexión
	// con la capa repository
	@Autowired
	private IResultado iresultado;

	@Override
	public void guardar() {
		// Acción ejecutada para implementar el metodo guardar()
		iresultado.guardar();
	}

	@Override
	public Resultado mostrar() {
		// Acción ejecutada para implementar el metodo mostrar()
		Resultado resultado = iresultado.mostrar();
		return resultado;
	}

	@Override
	public void eliminar() {
		// Acción ejecutada para implementar el metodo eliminar()
		iresultado.eliminar();
	}

	@Override
	public Resultado modificar() {
		// Acción ejecutada para implementar el metodo modificar()
		Resultado resultado = iresultado.modificar();
		return resultado;
	}

}
