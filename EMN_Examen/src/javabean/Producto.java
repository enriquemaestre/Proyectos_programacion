package javabean;

public class Producto {
	
	private long codigoBarras;
	private String descripcion;
	private double precioUnitario;
	private int cantidadStock;
	private String talla;
	private String color;
	
	
	
	
	
	public Producto(long codigoBarras, String descripcion, double precioUnitario, int cantidadStock, String talla,
			String color) {
		super();
		this.codigoBarras = codigoBarras;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadStock = cantidadStock;
		this.talla = talla;
		this.color = color;
	}
	
	

	public Producto() {
		super();
	}
	
	
	
	public long getCodigoBarras() {
		return codigoBarras;
	}



	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPrecioUnitario() {
		return precioUnitario;
	}



	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}



	public int getCantidadStock() {
		return cantidadStock;
	}



	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}



	public String getTalla() {
		return talla;
	}



	public void setTalla(String talla) {
		this.talla = talla;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", cantidadStock=" + cantidadStock + ", talla=" + talla + ", color=" + color + "]";
	}

		
	
	/*
	 * Metodos propios
	 */
	
	


	public void precioConIva (int iva) {
		precioUnitario= precioUnitario +(precioUnitario*iva)/100;
	}
	
	public void aumentarStock (int cantidad) {
		cantidadStock += cantidad;
	}
	
	public void disminuirStock (int cantidad) {
		cantidadStock -= cantidad;
	}
	
	public double precioAplicado() {
		switch (talla.toUpperCase()) {
		case "XS":
			return precioUnitario;
		case "S": 
		case "M":
		case "L":
		case "XL":
			return precioUnitario*1.03;
		case "XXL":
		case "XXXL":
			return precioUnitario*1.04;
		default:
			return precioUnitario;
		}
	}
	
}


