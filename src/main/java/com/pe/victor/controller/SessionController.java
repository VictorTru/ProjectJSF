/**
 * 
 */
package com.pe.victor.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import com.pe.victor.dto.UsuarioDTO;

/**
 * @author Victor Trujillo CH
 * Clase encargada de mantener la informacion del usuario ingresado del aplicativo
 * en sesion.
 */

@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * Usuario que mantendra en sesion.
	 */
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la sesion del usuario.
	 */
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario de la sesion");
	}

	/**
	 * @return the usuarioDTO
	 */
	
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
	

}
