package Ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Leer numeros hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
		 * Al final mostrar las siguientes estadísticas:
		 * -cuantos son pares e impares
		 * -cuanto suman los pares y cuanto los impares
		 */
		
		Scanner leer = new Scanner(System.in);
		int num=0, contPares=0, contImpares=0, sumaPares=0, sumaImpares=0;
		System.out.println("Escribe un numero entero (para acabar escribe 0):");
		num = leer.nextInt();
		while(num!=0) {
			if(num%2==0)
				contPares++;
			else
				contImpares++;
			if(num%2==0)
				sumaPares +=num;
			else
				sumaImpares +=num;
		System.out.println("Escribe otro numero: ");
		num = leer.nextInt();
			
		}
		System.out.println("ESTADISTICAS:");
		System.out.println("Hay un total de : " + contPares + " numeros pares");
		System.out.println("Hay un total de : " + contImpares + " numeros impares");
		System.out.println("La suma de los numeros pares tiene como resultado: "+ sumaPares);
		System.out.println("La suma de los numeros impares tiene como resultado: "+ sumaImpares);
		

	}

}
