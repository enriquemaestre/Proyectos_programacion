package Testing;

import javabean.Producto;

public class TestingProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(001,"camiseta de rayas", 12,4,"S","rojo");
		Producto producto2 = new Producto();
		
		producto2.setCodigoBarras(002);
		producto2.setDescripcion("camiseta lisa");
		producto2.setPrecioUnitario(7);
		producto2.setCantidadStock(8);
		producto2.setTalla("XXL");
		producto2.setColor("blanco");
		
		
		
		
		producto1.precioConIva(21);
		System.out.println("El precio del producto " + producto1.getDescripcion() +  " con IVA es de : " + producto1.getPrecioUnitario());
		
		System.out.println("Para la talla S, asciende a un total de : " + producto1.precioAplicado());
		producto1.disminuirStock(2);
		System.out.println("Se han comprado 2 " + producto1.getDescripcion() + " y nos deja un total de " + producto1.getCantidadStock() + " unidades en stock");
		
		producto1.aumentarStock(3);
		System.out.println("Para poder hacer frente a futuras compras hemos aumentado el stock a :" + producto1.getCantidadStock() + " unidades");
		
		
		producto2.precioConIva(12);
		
		System.out.println("El precio del otro producto, " + producto2.getDescripcion() +  " con IVA es de : " + producto2.getPrecioUnitario());
		
		System.out.println("Para la talla XL, asciende a un total de : " + producto2.precioAplicado());
		producto2.disminuirStock(3);
		System.out.println("Se han comprado 3 " + producto1.getDescripcion() + " y nos deja un total de " + producto2.getCantidadStock() + " unidades en stock");

	}

}
