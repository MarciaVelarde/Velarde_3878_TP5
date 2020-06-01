package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;

/**
 * Interface que nos permitira disminuir el acoplamiento de nuestra aplicación y
 * nos permitira interactuar con los datos almacenados en una base de datos
 * 
 * @author Marcia Velarde
 *
 */
public interface IEstadio {

	// Declaramos los métodos abstractos.
	public void guardar();

	public Estadio mostrar();

	public void eliminar();

	public Estadio modificar();
	
}