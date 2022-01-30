/**
 * 
 */
package com.pe.victor.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Victor Trujillo CH
 * Clase que se encarga cerrar session del usuario.
 */

@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void init() {
		System.out.println("Cerrar Session");
	}
	
	/**
	 * Metodo que permite cerrar session del usuario y regresar al login.xhtml.
	 */
	
	public void cerrarSession() {
		ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();
		ex.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que permite redirrecionar a una pantalla.
	 * @param pagina {@link String} pagina a redireccionarse.
	 * @throws IOException Excepcion en caso error al encontrar la pagina.
	 */
	
	public void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
}
