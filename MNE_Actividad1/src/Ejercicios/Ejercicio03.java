package Ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Escribir todos los numeros del 100 al 0 de 7 en 7. Al final, mostrar
		 * las siguientes estadísticas:
		 * -cuantos numeros has escrito
		 * -cuanto suman los numeros escrito
		 * -cuantos de estos numeros son pares
		 */
		
		int cont=0, contPares=0, suma=0;
		
		for(int i=100; i>=0; i -=7) {
			System.out.println(i);
			cont++;
			suma +=i;
			if(i%2==0)
				contPares++;
		}
		
		System.out.println("Hemos escrito un total de :" + cont + " numeros");
		System.out.println("La suma de estos numeros da igual a :" + suma);
		System.out.println("Hay un total de : " + contPares + " numeros pares");

	}

}
