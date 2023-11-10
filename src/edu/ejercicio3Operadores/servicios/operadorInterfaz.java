package edu.ejercicio3Operadores.servicios;

import java.util.Scanner;

/**
 * Interfaz donde esta los metodods logicos
 * @author jpr-101123
 */
public interface operadorInterfaz {
/**
 * metodo de igualdad logica
 * @author jpr-101123
 * @param param1
 * @param param2
 */
	public void igualar(Scanner param1,Scanner param2);
	
	/**
	 * metodo de desigualdad logica
	 * @author jpr-101123
	 * @param param1
	 * @param param2
	 */
	public void desigualar(Scanner param1,Scanner param2);
}
