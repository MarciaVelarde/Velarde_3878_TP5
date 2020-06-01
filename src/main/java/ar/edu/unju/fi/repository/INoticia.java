package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;

/**
 * Interface que nos permitira disminuir el acoplamiento de nuestra aplicación y
 * nos permitira interactuar con los datos almacenados en una base de datos
 * 
 * @author Marcia Velarde
 *
 */
public interface INoticia {

	// Declaramos los métodos abstractos.
	public void guardar();

	public Noticia mostrar();

	public void eliminar();

	public Noticia modificar();
	
}
