package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;

/**
	 * Interface que nos permitira disminuir el acoplamiento de nuestra aplicación y
	 * nos permitira interactuar con los datos almacenados en una base de datos
	 * 
	 * @author Marcia Velarde
	 *
	 */
public interface ICuota {

		// Declaramos los métodos abstractos.
		public void guardar();

		public Cuota mostrar();

		public void eliminar();

		public Cuota modificar();

	}
