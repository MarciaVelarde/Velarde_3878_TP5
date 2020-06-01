package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;

/**
 * Interface que nos permitira disminuir el acoplamiento de nuestra aplicación y
 * nos permitira interactuar con los datos almacenados en una base de datos
 * 
 * @author Marcia Velarde
 *
 */
public interface IResultado {

	// Declaramos los métodos abstractos.
	public void guardar();

	public Resultado mostrar();

	public void eliminar();

	public Resultado modificar();
	
}
