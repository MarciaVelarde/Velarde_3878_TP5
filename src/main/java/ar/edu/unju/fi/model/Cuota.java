package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase utilizada para gestionar la cuota de un usuario
 * 
 * @author Marcia Velarde
 *
 */
@Component
public class Cuota {

	// -------------VARIABLES MIEMBRO-------------//

	/**
	 * Variable miembro de tipo long para gestionar el id de una cuota
	 */
	private long id;
	/**
	 * Variable miembro de tipo LocalDate para gestionar la fecha de pago de una
	 * cuota
	 */
	private LocalDate fechaPago;
	/**
	 * Variable miembro de tipo String para gestionar el periodo al que pertenece la
	 * cuota
	 */
	private String periodo;
	/**
	 * Variable miembro de tipo double para gestionar el monto de la cuota
	 */
	private double monto;
	/**
	 * Variable miembro de tipo String para gestionar el estado de una cuota
	 */
	private String estado;
	/**
	 * Variable miembro de tipo Usuario para gestionar al usuario que paga la cuota
	 */
	@Autowired
	private Usuario usuario;

	// ---------------CONSTRUCTORES---------------//

	/**
	 * Constructor sin parametros
	 */
	public Cuota() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param id
	 * @param fechaPago
	 * @param periodo
	 * @param monto
	 * @param estado
	 * @param usuario
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}

	// ------------------METODOS------------------//

	/**
	 * Método que muestra el valor de todos los atributos.
	 * 
	 * @return una cadena con toda la informacion del objeto Cuota, es decir el
	 *         valor de sus atributos
	 */
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}
	
	// -------------METODOS ACCESORES-------------//

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}

	/**
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * @return the periodo
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * @return the monto
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
