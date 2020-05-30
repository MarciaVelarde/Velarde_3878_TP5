package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase utilizada para gestionar una noticia
 * 
 * @author Marcia Velarde
 *
 */
@Component
public class Noticia {

	// -------------VARIABLES MIEMBRO-------------//

	/**
	 * Variable miembro de tipo LocalDate para gestionar la fecha de una noticia
	 */
	private LocalDate fecha;
	/**
	 * Variable miembro de tipo String para gestionar el titulo de una noticia
	 */
	private String titulo;
	/**
	 * Variable miembro de tipo String para gestionar el resumen de una noticia
	 */
	private String resumen;

	// ---------------CONSTRUCTORES---------------//

	/**
	 * Constructor sin parametros
	 */
	public Noticia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param fecha
	 * @param titulo
	 * @param resumen
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}

	// ------------------METODOS------------------//

	/**
	 * Método que muestra el valor de todos los atributos.
	 * 
	 * @return una cadena con toda la informacion del objeto Noticia, es decir el
	 *         valor de sus atributos
	 */
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}

	// -------------METODOS ACCESORES-------------//

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
		
}