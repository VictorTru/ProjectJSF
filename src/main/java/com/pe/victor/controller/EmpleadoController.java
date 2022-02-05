<<<<<<< HEAD

package com.pe.victor.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pe.victor.entity.Empleado;
import com.pe.victor.service.EmpleadoService;

/**
 * @author Victor Trujillo CH
 * Clase Controller que se encarga de procesar la informacion para la pantalla empleado.xhtml.
 */

@ManagedBean
@ViewScoped
public class EmpleadoController {
	
	/**
	 * Lista empleados para la tabla.
	 */
	
	private List<Empleado> empleads; 
	
	/**
	 * Lista de empleados filtrados.
	 */
	
	private List<Empleado> empleadosFiltrados;
	
	/**
	 * Objeto de la Clase Service para realizar la logica de negocio de los empleados 
	 */
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.ConsultarEmpleados();
	}
	
	public void ConsultarEmpleados() {
		this.empleads = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleads
	 */
	
	public List<Empleado> getEmpleads() {
		return empleads;
	}

	/**
	 * @param empleads the empleads to set
	 */
	
	public void setEmpleads(List<Empleado> empleads) {
		this.empleads = empleads;
	}

	/**
	 * @return the empleadoService
	 */
	
	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}

	/**
	 * @param empleadoService the empleadoService to set
	 */
	
	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	/**
	 * @return the empleadosFiltrados
	 */
	
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}
	
	


	
	
}