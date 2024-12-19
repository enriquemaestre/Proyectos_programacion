package testingFiesta;

import javabean.Fiesta;

public class testFiestaJubilacion {

	public static void main(String[] args) {
		
		Fiesta fiestaJubilacion;
		
		fiestaJubilacion = new Fiesta ();
		fiestaJubilacion.setTipoFiesta("Fiesta Jubilacion");
		fiestaJubilacion.setInvitados(35);
		fiestaJubilacion.setDireccion("Calle Real 32");
		fiestaJubilacion.setFecha("7 de diciembre");
		fiestaJubilacion.setHora("19:00");
		fiestaJubilacion.setBocadillos(35);
		fiestaJubilacion.setBebidas(40);
		
		fiestaJubilacion.toString();
		
		//Mostramos en pantalla la informacion basica de la fiesta
		
				System.out.println("El día  " + fiestaJubilacion.getFecha() + 
						" a partir de las  " + fiestaJubilacion.getHora() + 
						" se celebra una  " + fiestaJubilacion.getTipoFiesta());
				System.out.println("Cantidad de invitados : " + 
				fiestaJubilacion.getInvitados());
				
		
		//Mostramos los metodos propios
				
				
				
				
				System.out.println("La fiesta ha costado un total de : " +  
				fiestaJubilacion.precioFiesta());
				
				System.out.println("La fiesta ha concluido con un saldo total de: " +
						fiestaJubilacion.saldoFiesta() + " euros");
				
				System.out.println("Es decir, la fiesta ha sido un " + 
				fiestaJubilacion.resultadoFiesta());
				
				
				fiestaJubilacion.invitar(5);
				
				System.out.println("Para esta fiesta al final contamos con la presencia de " + fiestaJubilacion.getInvitados() );
				
				fiestaJubilacion.cancelarInvitacion(8);
				System.out.println("Despues de las cancelaciones hemos sido un total de : " + fiestaJubilacion.getInvitados() + " personas");
		

	}

}
