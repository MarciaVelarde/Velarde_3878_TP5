package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase utilizada para gestionar los datos de un equipo
 * 
 * @author Marcia Velarde
 *
 */
@Component
public class Equipo {

	// -------------VARIABLES MIEMBRO-------------//

	/**
	 * Variable miembro de tipo String para gestionar el nombre de un equipo
	 */
	private String nombre;
	/**
	 * Variable miembro de tipo Estadio para gestionar el nombre de un estadio
	 */
	@Autowired
	private Estadio estadio;

	// ---------------CONSTRUCTORES---------------//

	/**
	 * Constructor sin parametros
	 */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre
	 * @param estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}

	// ------------------METODOS------------------//
	
	/**
	 * Método que muestra el valor de todos los atributos.
	 * 
	 * @return una cadena con toda la informacion del objeto Equipo, es decir el
	 *         valor de sus atributos
	 */
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}

	// -------------METODOS ACCESORES-------------//

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
}
