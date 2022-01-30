/**
 * 
 */
package com.pe.victor.service;

import java.util.ArrayList;
import java.util.List;

import com.pe.victor.entity.Empleado;

/**
 * @author Victor Trujillo CH
 * Clase que permite realizar la logica de negocio para empleados.
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados para empresas de TI.
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados(){
		/**
		 * Generar la lista de empleados a consultar.
		 */
		List<Empleado> empleados = new ArrayList<>();
		
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		Empleado empleado4 = new Empleado();
		
		//::::::: 1ER EMPLEADO :::::::
		
		empleado1.setCliente("7890");
		empleado1.setNombre("José");
		empleado1.setApellidos("Novoa");
		empleado1.setDni("45866321d");
		empleado1.setDireccion("Encrucijada 2, 2º E Madrid");
		
		//::::::: 2DO EMPLEADO :::::::
		
		empleado2.setCliente("5896");
		empleado2.setNombre("Jan");
		empleado2.setApellidos("Ruiz");
		empleado2.setDni("78451245d");
		empleado2.setDireccion("Etiopía 3, 4ºW , Vigo");
		
		//::::::: 3ER EMPLEADO :::::::
		
		empleado3.setCliente("2569");
		empleado3.setNombre("Xian");
		empleado3.setApellidos("Iconic");
		empleado3.setDni("89562323e");
		empleado3.setDireccion("Salamanca 45, 3ºS, Santiago");
		
		//::::::: 4TO EMPLEADO :::::::
		
		empleado4.setCliente("2548");
		empleado4.setNombre("Pep");
		empleado4.setApellidos("Mac");
		empleado4.setDni("85963966e");
		empleado4.setDireccion("Barcelona, nº123, 3ºS, Girona");
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);
		
		return empleados;
	}
	
}
