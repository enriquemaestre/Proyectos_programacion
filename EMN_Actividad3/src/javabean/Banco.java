package javabean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Clase que proporciona el objeto Banco
 * @author enriquemaestre
 * @version 1.0
 */

/**
 * Usamos el programa lombok para que genere los metodos inherentes:
 *  constructores con todo,con nada, equals y hashcode y ToString
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of = "codigo")

/**
 * Para la clase Banco necesitamos un numero entero que indique su 
 * codigo, un String para indicar el nombre y por ultimo un objeto 
 * de la clase @see Pais.java para indicar el pais en el que opera.
 */

public class Banco {
	private int codigo;
	private String nombre;
	private Pais paisOpera;
	
	

}
