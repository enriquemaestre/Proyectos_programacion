package Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Pedir una nota del 0 al 10 y mostrarla de la forma:
		 * insuficiente, suficiente, bien, notable, sobresaliente.
		 * Si la nota introducida no está en el rango mostrar "Nota errónea".
		 */
		
		int nota=0;
		
		System.out.println("Introduce tu nota para saber el resultado: ");
		Scanner leer= new Scanner(System.in);
		nota = leer.nextInt();
				
		switch (nota){
		case 0: case 1: case 2: case 3: case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6: 
			System.out.println("Bien");
			break;
		case 7: case 8:
			System.out.println("Notable");
			break;
		case 9: case 10:
			System.out.println("Sobresaliente");
			break;
			default :
				System.out.println("Nota errónea");
			
		}

	}

}
