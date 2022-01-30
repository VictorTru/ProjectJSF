/**
 * 
 */
package com.pe.victor.entity;

/**
 * @author Victor Trujillo CH
 * Clase que representa las entidades de Empleado
 */
public class Empleado {
	private String cliente;
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	
	
	
	public Empleado() {
		
	}
	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	@Override
	public String toString() {
		return "Empleado [cliente=" + cliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
				+ ", direccion=" + direccion + "]";
	}
	
	
	
	
}
