package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase utilizada para gestionar el resultado de un partido
 * 
 * @author Marcia Velarde
 *
 */
@Component
public class Resultado {

	// -------------VARIABLES MIEMBRO-------------//

	/**
	 * Variable miembro de tipo LocalDate para gestionar la fecha de un partido
	 */
	private LocalDate fecha;
	/**
	 * Variable miembro de tipo Equipo para gestionar el equipo1
	 */
	@Autowired
	private Equipo equipo1;
	/**
	 * Variable miembro de tipo Equipo para gestionar el equipo2
	 */
	@Autowired
	private Equipo equipo2;
	/**
	 * Variable miembro de tipo int para gestionar los goles del equipo1
	 */
	private int golesEquipo1;
	/**
	 * Variable miembro de tipo int para gestionar los goles del equipo2
	 */
	private int golesEquipo2;

	// ---------------CONSTRUCTORES---------------//

	/**
	 * Constructor sin parametros
	 */
	public Resultado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param fecha
	 * @param equipo1
	 * @param equipo2
	 * @param golesEquipo1
	 * @param golesEquipo2
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		super();
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	// ------------------METODOS------------------//

	/**
	 * Método que muestra el valor de todos los atributos.
	 * 
	 * @return una cadena con toda la informacion del objeto Resultado, es decir el
	 *         valor de sus atributos
	 */
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
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
	 * @return the equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}

	/**
	 * @param equipo1 the equipo1 to set
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	/**
	 * @return the equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}

	/**
	 * @param equipo2 the equipo2 to set
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	/**
	 * @return the golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	/**
	 * @param golesEquipo1 the golesEquipo1 to set
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	/**
	 * @return the golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	/**
	 * @param golesEquipo2 the golesEquipo2 to set
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
	
	
}
