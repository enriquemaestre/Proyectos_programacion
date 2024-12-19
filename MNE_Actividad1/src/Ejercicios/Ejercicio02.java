package Ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que muestre el producto y la suma
		 * de los 10 primeros numeros impares
		 */
		int suma=0, producto=1;
		System.out.println("Los 10 primeros numeros impares son: ");
		for (int i=1; i<=19; i+=2) {
			System.out.println(i);
			suma +=i;
			producto *=i;
		}
		
		System.out.println("La suma de los primeros 10 numeros impares da como resultado: "+ suma);
		System.out.println("El producto de los primeros 10 numeros impares da como resultado: "+ producto);

	}

}
