package testing;

import java.time.LocalDate;
import java.util.ArrayList;

import javabean.Banco;
import javabean.Cliente;
import javabean.Cliente2;
import javabean.DireccionCliente;
import javabean.Factura;
import javabean.Pais;
import javabean.Pedido;
import javabean.TarjetaBancaria;

public class testFactura {

	public static void main(String[] args) {
		Pais pais1 = new Pais (1,"España");
		Pais pais2 = new Pais (2, "Alemania");
		Banco banco1 = new Banco (1, "Caixa", pais1);
		Banco banco2 = new Banco (2, "Santander", pais2);
		TarjetaBancaria tarjeta1 = new TarjetaBancaria (47666426,2027,7,967,banco1,"Enrique Maestre");
		TarjetaBancaria tarjeta2= new TarjetaBancaria (47666427,2028,9,452,banco2,"Fernando Martinez");
		DireccionCliente direccion1 = new DireccionCliente ("Calle Venus 8","Alcorcon","Madrid",pais1);
		DireccionCliente direccion2 = new DireccionCliente ("Avda Libertad 29","Alcorcon","Madrid",pais1);
		Cliente cliente1 = new Cliente ("EMN","Enrique","enriquemaestre@gmail.com",LocalDate.of(2024,9,5),direccion1,tarjeta1);
		Pedido pedido1 = new Pedido (14, LocalDate.of(2025,1,17),"pendiente",cliente1);
		
		Factura factura1 = new Factura ("001/25", "factura 1 de 2025", LocalDate.of(2025,1,17),pedido1);
		
		
		
		
		
		
		
	
		
		System.out.println("La factura 1 tiene los siguientes datos: ");
		System.out.println("Descripcion de factura: ");
		System.out.println(factura1.getDescripcion());
		System.out.println("Fecha de factura: ");
		System.out.println(factura1.getPedido().getCreateAt());
		System.out.println("Estado del pedido: ");
		System.out.println(factura1.getPedido().getEstado());
		System.out.println("Nombre de cliente en factura: ");
		System.out.println(factura1.getPedido().getCliente().getNombre());
		System.out.println("Direccion del cliente para el pedido: ");
		System.out.println(factura1.getPedido().getCliente().getDireccion().getDireccion());
		System.out.println("El numero de tarjeta para el pedido: ");
		System.out.println(factura1.getPedido().getCliente().getTarjeta().getNumero());
		System.out.println("El nombre del titular de la tarjeta: ");
		System.out.println(factura1.getPedido().getCliente().getTarjeta().getTitular());
		System.out.println("El nombre del banco del titular de la tarjeta: ");
		System.out.println(factura1.getPedido().getCliente().getTarjeta().getBanco().getNombre());
		System.out.println("El pais del banco de la tarjeta del cliente: ");
		System.out.println(factura1.getPedido().getCliente().getTarjeta().getBanco().getPaisOpera().getNombre());
		System.out.println("El pais de la direccion del cliente del pedido de la factura: ");
		System.out.println(factura1.getPedido().getCliente().getDireccion().getPais().getNombre());
		
		
		
		
		
		
		
		
		

		
		

	}

}
