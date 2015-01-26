package ejercicios;

public class Producto {
	//atributos
	private int idProducto;
	private String nombreProducto;
	private double precioProducto;
	
	//constructor
	public Producto(int idProducto, String nombreProducto, double precioProducto) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto="
				+ nombreProducto + ", precioProducto=" + precioProducto + "€ ] \n";
	}
	
	
	
	
}
