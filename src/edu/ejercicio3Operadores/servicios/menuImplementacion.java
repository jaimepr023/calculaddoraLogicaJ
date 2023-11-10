package edu.ejercicio3Operadores.servicios;

import java.util.Scanner;

/**
 * implementacion que implementa la interfaz del menu
 * @author jpr-101123
 */
public class menuImplementacion implements menuInterfaz {

	
	public void mensajeBienvenida() {
		System.out.println("Bienvenido a la calculadora logica.");
		
	}

	@Override
	public int menuCalc(Scanner opcionSeleccioanada) {
		
		int opcionScogida;
		
		System.out.println("------------------------");
		System.out.println("Caso 0. Cerrar Menu");
		System.out.println("Caso 1. Igualdad");
		System.out.println("Caso 2. Desigauldad");
		System.out.println("------------------------");

		opcionScogida = opcionSeleccioanada.nextInt();
		
		return opcionScogida;
	}

}
