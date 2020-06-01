package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Equipo;

/**
 * Interface que nos permitira disminuir el acoplamiento de nuestra aplicación y
 * nos permitira interactuar con los datos almacenados en una base de datos
 * 
 * @author Marcia Velarde
 *
 */
public interface IEquipo {

	// Declaramos los métodos abstractos.
	public void guardar();

	public Equipo mostrar();

	public void eliminar();

	public Equipo modificar();

}
