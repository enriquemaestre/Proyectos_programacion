package testing;

import java.time.LocalDate;

import javabean.Banco;
import javabean.Cliente;
import javabean.Cliente2;
import javabean.DireccionCliente;
import javabean.Factura;
import javabean.Pais;
import javabean.Pedido;
import javabean.TarjetaBancaria;

public class testFacturaCliente2 {

	public static void main(String[] args) {
		Pais pais1 = new Pais (1,"España");
		Pais pais2 = new Pais (2, "Alemania");
		Banco banco1 = new Banco (1, "Caixa", pais1);
		Banco banco2 = new Banco (2, "Santander", pais2);
		TarjetaBancaria tarjeta1 = new TarjetaBancaria (47666426,2027,7,967,banco1,"Enrique Maestre");
		TarjetaBancaria tarjeta2= new TarjetaBancaria (47666427,2028,9,452,banco2,"Fernando Martinez");
		TarjetaBancaria tarjeta3= new TarjetaBancaria (12341531,2029,9,142,banco1,"Fernando Martinez");
		DireccionCliente direccion1 = new DireccionCliente ("Calle Venus 8","Alcorcon","Madrid",pais1);
		DireccionCliente direccion2 = new DireccionCliente ("Avda Libertad 29","Alcorcon","Madrid",pais1);
		Cliente cliente1 = new Cliente ("EMN","Enrique","enriquemaestre@gmail.com",LocalDate.of(2024,9,5),direccion1,tarjeta1);
		Pedido pedido1 = new Pedido (14, LocalDate.of(2025,1,17),"pendiente",cliente1);
		
		Factura factura1 = new Factura ("001/25", "factura 1 de 2025", LocalDate.of(2025,1,17),pedido1);
		
		Cliente2 cliente2 = new Cliente2 ("Prueba");
		
		cliente2.verTarjetas();
		System.out.println("Se incorporan nuevas tarjetas al cliente2: ");
		cliente2.getTarjeta().add(tarjeta2);
		cliente2.getTarjeta().add(tarjeta3);
		
		System.out.println("El cliente tiene las siguientes tarjetas: ");
		cliente2.verTarjetas();
		
		
		System.out.println("La primera tarjeta del cliente pertenece al banco: ");
		System.out.println(cliente2.getTarjeta().getFirst().getBanco().getNombre());
		System.out.println("La segunda tarjeta del cliente pertenece al banco: ");
		System.out.println(cliente2.getTarjeta().getLast().getBanco().getNombre());
		
		System.out.println("La primera tarjeta del cliente pertenece al pais: ");
		System.out.println(cliente2.getTarjeta().getFirst().getBanco().getPaisOpera().getNombre());
		
		System.out.println("La segunda tarjeta del cliente pertenece al pais: ");
		System.out.println(cliente2.getTarjeta().getLast().getBanco().getPaisOpera().getNombre());

	}

}
