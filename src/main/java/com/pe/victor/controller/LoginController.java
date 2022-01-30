/**
 * 
 */
package com.pe.victor.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Victor Trujillo CH
 *
 */

@ManagedBean
public class LoginController {

	private String usuario;
	
	private String password;

	public void ingresar() {
		
		
		if (usuario.equals("a") && password.equals("a")) {
			try {
				
				this.redireccionar("empleado.xhtml");
				
				System.out.println("Usuario: "+usuario);
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL,"La pagina no se encuentra",""));
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o Contraseña Incorrecta",""));
		}
	}
	
	public void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
