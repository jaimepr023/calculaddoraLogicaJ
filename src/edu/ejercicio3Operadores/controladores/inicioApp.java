package edu.ejercicio3Operadores.controladores;

import java.util.Scanner;

import edu.ejercicio3Operadores.servicios.menuImplementacion;
import edu.ejercicio3Operadores.servicios.menuInterfaz;
import edu.ejercicio3Operadores.servicios.operadorImplementacion;
import edu.ejercicio3Operadores.servicios.operadorInterfaz;
/**
 * clase principal de nuestro programa donde esta el procedimiento 
 * 
 */
public class inicioApp {
/**
 * metodo principal de nuestra aplicacion
 * @author jpr-101123
 * @param args
 */
	public static void main(String[] args) {
      menuInterfaz mi = new menuImplementacion();
      operadorInterfaz op = new operadorImplementacion();
      mi.mensajeBienvenida();
      
      int opcionUsuario;
      boolean cerrarMenu=false;
      Scanner seleccion = new Scanner(System.in);

      
      while(!cerrarMenu) {
    	  
    	  opcionUsuario = mi.menuCalc(seleccion);
    	  
    	  switch(opcionUsuario) {
    	  case 0:
    		  System.out.println("[INFOS]-Se ejecutara caso 0");
    		  cerrarMenu=true;
    		  break;
    	  case 1: 
    		  System.out.println("[INFOS]-Has seleccionado la opcion igualdad");
    		  op.igualar(seleccion, seleccion);
    		  
    		  break;
    	  case 2:
    		  System.out.println("[INFOS]-Has seleccionado la opcion desigualdad");
    		  op.desigualar(seleccion, seleccion);
    		  break;
    	  }
      }
		
	}

}
