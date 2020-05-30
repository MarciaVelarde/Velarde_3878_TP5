package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase utilizada para gestionar los datos de un usuario
 * 
 * @author Marcia Velarde
 *
 */
@Component
public class Usuario {

	// -------------VARIABLES MIEMBRO-------------//

	/**
	 * Variable miembro de tipo long para gestionar el id de un usuario
	 */
	private long id;
	/**
	 * Variable miembro de tipo String para gestionar el nombre de un usuario
	 */
	private String nombre;
	/**
	 * Variable miembro de tipo String para gestionar el apellido de un usuario
	 */
	private String apellido;
	/**
	 * Variable miembro de tipo LocalDate para gestionar la fecha de nacimiento de
	 * un usuario
	 */
	private LocalDate fechaNacimiento;
	/**
	 * Variable miembro de tipo String para gestionar la direccion de un usuario
	 */
	private String direccion;
	/**
	 * Variable miembro de tipo long para gestionar el dni de un usuario
	 */
	private long dni;
	/**
	 * Variable miembro de tipo LocalDate para gestionar la fecha de alta de un
	 * usuario
	 */
	private LocalDate fechaAlta;
	/**
	 * Variable miembro de tipo String para gestionar el tipo de usuario (socio,
	 * admin, consultor)
	 */
	private String tipo;
	/**
	 * Variable miembro de tipo String para gestionar el password de un usuario
	 */
	private String password;

	// ---------------CONSTRUCTORES---------------//

	/**
	 * Constructor sin parametros
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param direccion
	 * @param dni
	 * @param fechaAlta
	 * @param tipo
	 * @param password
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}

	// ------------------METODOS------------------//

	/**
	 * Método que muestra el valor de todos los atributos.
	 * 
	 * @return una cadena con toda la informacion del objeto Usuario, es decir el
	 *         valor de sus atributos
	 */
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta + ", tipo="
				+ tipo + ", password=" + password + "]";
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	/**
	 * @return the dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * @return the fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
