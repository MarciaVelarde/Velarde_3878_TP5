package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase utilizada para gestionar los datos de un estadio
 * 
 * @author Marcia Velarde
 *
 */
@Component
public class Estadio {

	// -------------VARIABLES MIEMBRO-------------//

	/**
	 * Variable miembro de tipo String para gestionar el nombre de un estadio
	 */
	private String nombre;
	/**
	 * Variable miembro de tipo LocalDate para gestionar la fecha de fundacion de un
	 * estadio
	 */
	private LocalDate fechaFundacion;
	/**
	 * Variable miembro de tipo String para gestionar el nombre de una ciudad donde
	 * se encuentra el estadio
	 */
	private String ciudad;
	/**
	 * Variable miembro de tipo int para gestionar la capacidad de un estadio
	 */
	private int capacidad;
	/**
	 * Variable miembro de tipo String para gestionar la direccion de un estadio
	 */
	private String direccion;

	// ---------------CONSTRUCTORES---------------//

	/**
	 * Constructor sin parametros
	 */
	public Estadio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param direccion
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	// ------------------METODOS------------------//
	
	/**
	 * Método que muestra el valor de todos los atributos.
	 * 
	 * @return una cadena con toda la informacion del objeto Estadio, es decir el
	 *         valor de sus atributos
	 */
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
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
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
