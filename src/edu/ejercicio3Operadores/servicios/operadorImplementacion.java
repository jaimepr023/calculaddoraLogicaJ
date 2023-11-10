package edu.ejercicio3Operadores.servicios;

import java.util.Scanner;

/**
 * implementacion que implementa a su interfaz
 * @author jpr-101123
 */
public class operadorImplementacion implements operadorInterfaz {

	public void igualar(Scanner param1,Scanner param2) {
		System.out.println("Introduzca la primera expresión:");
		String texto1=param1.next();
		System.out.println("Introduzca la segunda expresión:");

		String texto2=param2.next();
		
		if(texto1.equals(texto2)) {
			
			System.out.println("Resultado de la igualdad:true");
		}else 
		{
			System.out.println("Resultado de la igualdad:false");
		}
		
	}

	
	public void desigualar(Scanner param1,Scanner param2) {
		System.out.println("Introduzca la primera expresión:");
		String texto1=param1.next();
		System.out.println("Introduzca la segunda expresión:");
		String texto2=param2.next();
		
		if(!texto1.equals(texto2)) {
			
			System.out.println("Resultado de la desigualdad:true");
		}else 
		{
			System.out.println("Resultado de la desigualdad:false");
		}
		
	}

	
}
