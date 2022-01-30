/**
 * 
 */
package com.pe.victor.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pe.victor.entity.Empleado;
import com.pe.victor.service.EmpleadoService;

/**
 * @author Victor Trujillo CH
 *
 */

@ManagedBean
@ViewScoped
public class EmpleadoController {

	private List<Empleado> empleads; 
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.ConsultarEmpleados();
	}
	
	public void ConsultarEmpleados() {
		this.empleads = this.empleadoService.consultarEmpleados();
	}

	public List<Empleado> getEmpleads() {
		return empleads;
	}

	public void setEmpleads(List<Empleado> empleads) {
		this.empleads = empleads;
	}

	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}


	
	
}
