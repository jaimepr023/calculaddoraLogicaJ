package edu.ejercicio3Operadores.servicios;

import java.util.Scanner;

/**
 * interfaz donde esta la cabecera de los metodos del menu
 * @author jpr-101123
 */
public interface menuInterfaz {
	/**
	 * metodo que imprime por pantalla el mensaje de bienvenida
	 * @author jpr-101123
	 */
	
	public void mensajeBienvenida();
	
	/**
	 * metodo que devuelve la opcion elegida del menu
	 * @author jpr-101123
	 * @param opcionSeleccioanada
	 * @return
	 */
	public int menuCalc(Scanner opcionSeleccioanada);

}
