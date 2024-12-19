package testingFiesta;

import javabean.Fiesta;

public class testFiesta {

	

	public static void main(String[] args) {
		
		Fiesta fiestaInfantil;
		
		
		fiestaInfantil = new Fiesta();
		fiestaInfantil.setTipoFiesta("Infantil");
		fiestaInfantil.setInvitados(15);
		fiestaInfantil.setDireccion("Calle Fuente 13");
		fiestaInfantil.setFecha("15 de noviembre de 2024");
		fiestaInfantil.setHora("16:00");
		fiestaInfantil.setBocadillos(10);
		fiestaInfantil.setBebidas(10);
		
		//Mostramos en pantalla la informacion basica de la fiesta
		
		System.out.println("El día  " + fiestaInfantil.getFecha() + " a partir "
				+ "de las  " + fiestaInfantil.getHora() + " se celebra una "
				+ "fiesta  " + fiestaInfantil.getTipoFiesta());
		System.out.println("Cantidad de invitados : " + 
		fiestaInfantil.getInvitados());
		
		//Mostramos los metodos propios
		
		
		
		
		
		System.out.println("La fiesta ha costado un total de : " +  fiestaInfantil.precioFiesta());
		
		System.out.println("La fiesta ha concluido con un saldo total de: " +
				fiestaInfantil.saldoFiesta() + " euros");
		
		System.out.println("Es decir, la fiesta ha sido un " + fiestaInfantil.resultadoFiesta());
		
		fiestaInfantil.invitar();
		System.out.println("Para esta fiesta al final contamos con la presencia de " + fiestaInfantil.getInvitados() );
		
		fiestaInfantil.cancelarInvitacion();
		System.out.println("Despues de las cancelaciones hemos sido un total de : " + fiestaInfantil.getInvitados() + " personas");
		

	}

}
