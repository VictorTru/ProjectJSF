/**
 * 
 */
package com.pe.victor.service;

import java.util.ArrayList;
import java.util.List;

import com.pe.victor.entity.Empleado;

/**
<<<<<<< HEAD
<<<<<<< HEAD
 * @author Victor Trujillo CH Clase que permite realizar la logica de negocio
 *         para empleados.
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados para empresas de TI.
	 * 
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados() {
		/**
		 * Generar la lista de empleados a consultar.
		 */
		List<Empleado> empleados = new ArrayList<>();

		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		Empleado empleado4 = new Empleado();
		Empleado empleado5 = new Empleado();
		Empleado empleado6 = new Empleado();
		Empleado empleado7 = new Empleado();
		Empleado empleado8 = new Empleado();
		Empleado empleado9 = new Empleado();
		Empleado empleado10 = new Empleado();
		Empleado empleado11 = new Empleado();
		Empleado empleado12 = new Empleado();

		// ::::::: 1ER EMPLEADO :::::::

		empleado1.setCliente("7890");
		empleado1.setNombre("José");
		empleado1.setApellidos("Novoa");
		empleado1.setDni("45866321d");
		empleado1.setDireccion("Encrucijada 2, 2º E Madrid");

		// ::::::: 2DO EMPLEADO :::::::

		empleado2.setCliente("5896");
		empleado2.setNombre("Jan");
		empleado2.setApellidos("Ruiz");
		empleado2.setDni("78451245d");
		empleado2.setDireccion("Etiopía 3, 4ºW , Vigo");

		// ::::::: 3ER EMPLEADO :::::::

		empleado3.setCliente("2569");
		empleado3.setNombre("Xian");
		empleado3.setApellidos("Iconic");
		empleado3.setDni("89562323e");
		empleado3.setDireccion("Salamanca 45, 3ºS, Santiago");

		// ::::::: 4TO EMPLEADO :::::::

		empleado4.setCliente("2548");
		empleado4.setNombre("Pep");
		empleado4.setApellidos("Mac");
		empleado4.setDni("85963966e");
		empleado4.setDireccion("Barcelona, nº123, 3ºS, Girona");

		// ::::::: 5TO EMPLEADO :::::::

		empleado5.setCliente("1234");
		empleado5.setNombre("Stéven");
		empleado5.setApellidos("Calle");
		empleado5.setDni("34666309g");
		empleado5.setDireccion("Encrucijada 2, 2º E Madrid");

		// ::::::: 6TO EMPLEADO :::::::

		empleado6.setCliente("5896");
		empleado6.setNombre("James");
		empleado6.setApellidos("Ramires");
		empleado6.setDni("12454545d");
		empleado6.setDireccion("Etiopía 3, 4ºW , Vigo");

		// ::::::: 7TO EMPLEADO :::::::

		empleado7.setCliente("2569");
		empleado7.setNombre("Rafael");
		empleado7.setApellidos("Dreito");
		empleado7.setDni("45092323v");
		empleado7.setDireccion("Salamanca 45, 3ºS, Santiago");

		// ::::::: 8TO EMPLEADO :::::::

		empleado8.setCliente("2548");
		empleado8.setNombre("Franck");
		empleado8.setApellidos("Muller");
		empleado8.setDni("30063966r");
		empleado8.setDireccion("Barcelona, nº123, 3ºS, Girona");

		// ::::::: 9NO EMPLEADO :::::::

		empleado9.setCliente("7890");
		empleado9.setNombre("Mirian");
		empleado9.setApellidos("Willonws");
		empleado9.setDni("55869321d");
		empleado9.setDireccion("Encrucijada 2, 2º E Madrid");

		// ::::::: 10MO EMPLEADO :::::::

		empleado10.setCliente("5896");
		empleado10.setNombre("Artorius");
		empleado10.setApellidos("Dominguez");
		empleado10.setDni("21499245d");
		empleado10.setDireccion("Etiopía 3, 4ºW , Vigo");

		// ::::::: 11VO EMPLEADO :::::::

		empleado11.setCliente("2569");
		empleado11.setNombre("Guren");
		empleado11.setApellidos("Iconic");
		empleado11.setDni("89562323e");
		empleado11.setDireccion("Salamanca 45, 3ºS, Santiago");

		// ::::::: 12VO EMPLEADO :::::::

		empleado12.setCliente("9004");
		empleado12.setNombre("Jose");
		empleado12.setApellidos("Mothiño");
		empleado12.setDni("60233964t");
		empleado12.setDireccion("Barcelona, nº123, 3ºS, Girona");

		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);
		empleados.add(empleado5);
		empleados.add(empleado6);
		empleados.add(empleado7);
		empleados.add(empleado8);
		empleados.add(empleado9);
		empleados.add(empleado10);
		empleados.add(empleado11);
		empleados.add(empleado12);

		return empleados;
	}


}
