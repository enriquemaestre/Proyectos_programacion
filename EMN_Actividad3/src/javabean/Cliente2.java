package javabean;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of ="idCliente2")
@ToString (exclude ="tarjeta")
public class Cliente2 {
	private String idCliente2;
	private String nombre;
	private String email;
	private LocalDate createdAt;
	private DireccionCliente direccion;
	private ArrayList<TarjetaBancaria> tarjeta = new ArrayList <TarjetaBancaria>();
	
	public Cliente2(String idCliente2) {
		this.tarjeta = new ArrayList<>();
	}
	
	public void verTarjetas() {
		if (tarjeta.isEmpty()) {
			System.out.println("No hay tarjetas");
		} else  {
			for (int i=0; i < tarjeta.size(); i++){
				System.out.println(tarjeta.get(i));
			}
		}
	}

}
