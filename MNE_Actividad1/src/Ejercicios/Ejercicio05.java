package Ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Pedimos por pantalla un nombre y una contraseña
		 * -si el nombre coincide con "sara" preguntamos por la contraseña y si
		 *  coincide con "sarita", escribimos el mensaje "usuario y contraseña 
		 *  correctas, bienvenido a la aplicación"
		 * -si el nombre NO es "sara" escribimos "usuario incorrecto"
		 * -si el nombre es correcto y la contraseña no, escribimos "contraseña
		 *  incorrecta"
		 */
		
		String nombre="sara", contraseña="sarita";
		
		Scanner scRead = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre de usuario: ");
		
		nombre = scRead.next();
		
		if(nombre.equals("sara")) {
		
			System.out.println("Usuario correcto");
		    Scanner key = new Scanner(System.in);
		    System.out.println("Introduce contraseña");
		    contraseña =key.next();
		    
		    if(contraseña.equals("sarita"))
		    	System.out.println("Usuario y contraseña correctas, bienvenido a la aplicación");
		    else
		    	System.out.println("Contraseña incorrecta");
		    key.close();
		}
		else
			System.out.println("Usuario incorrecto");
		   
		scRead.close();
		
			
		
			
		

	}

}
