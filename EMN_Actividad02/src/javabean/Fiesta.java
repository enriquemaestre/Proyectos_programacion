package javabean;

public class Fiesta {

//Definición de atributos privados
	
private String tipoFiesta;
private String direccion;
private int bocadillos;
private int bebidas;
private int invitados;
private String fecha;
private String hora;




//Creación de los constructores con todo y con nada

public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas,
		int invitados, String fecha,String hora)
{
	super();
	this.tipoFiesta = tipoFiesta;
	this.direccion = direccion;
	this.bocadillos = bocadillos;
	this.bebidas = bebidas;
	this.invitados = invitados;
	this.fecha = fecha;
	this.hora = hora;
	
}

public Fiesta() {
	super();
}

//Añadimos los getter & setter

public String getTipoFiesta() {
	return tipoFiesta;
}

public void setTipoFiesta(String tipoFiesta) {
	this.tipoFiesta = tipoFiesta;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public int getBocadillos() {
	return bocadillos;
}

public void setBocadillos(int bocadillos) {
	this.bocadillos = bocadillos;
}

public int getBebidas() {
	return bebidas;
}

public void setBebidas(int bebidas) {
	this.bebidas = bebidas;
}

public int getInvitados() {
	
	return invitados;
}

public void setInvitados(int invitados) {
	this.invitados = invitados;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

//Definimos los métodos de object

@Override
public String toString() {
	return "fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ","
			+ " bocadillos=" + bocadillos + ", bebidas=" + bebidas + 
			", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
}

//Definición de métodos propios
/*
 * Con el metodo invitar solicitamos un numero entero para añadir al contador
 * de invitados.
 */

public int invitar(int cantidad) {
	return invitados= invitados + cantidad;
}

public void invitar () {
	this.invitados++;
}

/*
 * Con el metodo cancelarInvitacion solicitamos un numero entero para que reste 
 * invitados del contador
 */

public int cancelarInvitacion (int cancelados) {
	return invitados= invitados - cancelados;
}

public int cancelarInvitacion () {
	return invitados = invitados -1;
}
/*
 * Con el metodo saldoFiesta obtenemos cuanto ha sido el resultado de la fiesta,
 * teniendo en cuenta los gastos y los ingresos
 */
public int saldoFiesta () {
	return (5 * invitados) - precioFiesta();
}

/*
 * Con el metodo precioFiesta valoramos el resultado en funcion del numero 
 * de invitados y los gastos añadidos en material
 */

public int precioFiesta () {
	return (2 * bebidas) + (3 * bocadillos);
}

/*
 * Con el metodo resultadoFiesta comparamos el resultado obtenido con el
 * metodo anterior para indicar si ha sido: fracaso o exito
 */

public String resultadoFiesta() {
	if (saldoFiesta() < 0)
		return "fracaso";
	
	else 
		return "exito";
	
}



	
}



	
			
			











