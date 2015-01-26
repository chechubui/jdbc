package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	//atributos en una lista de Producto
	private List<Producto> listaTienda;

	//constructor
	public Tienda() {
		this.listaTienda = new ArrayList<Producto>();
		//estamos inicializando la lista a un arraylist vacio
	}

	//getter
	public List<Producto> getListaTienda() {
		return listaTienda;
	}
	
	//añadimos productos a nuestra lista
	public void addProducto(Producto p){
		this.listaTienda.add(p);
	}
	
	//eliminamos el producto 
	public void eliminarProducto(Producto p){
		//hacemos progrmacion segura para saber si esta el producto o no
		if (this.listaTienda.contains(p))
		this.listaTienda.remove(p);
	}
	
	//producto mas caro 
	public Producto productoMasCaro(){
		//double caro = listaTienda.get(0).getPrecioProducto();
		//como interesa empezar por un producto barato y no puede ser cero
		double caro=0;
		Producto productoMasCaro=null;
		//otra opcioen a igualq ue antes es qie empieze en el primer producto
		//Producto productoMasCaro = listaTienda.get(0);
		for(Producto producto : listaTienda){
			if (producto.getPrecioProducto()> caro){
				caro=producto.getPrecioProducto();
				productoMasCaro = producto;
			}
			
		}
		/*for (int i = 0; i < listaTienda.size(); i++) {
			if (listaTienda.get(i).getPrecioProducto() > caro){
				caro = listaTienda.get(i).getPrecioProducto();
				productoMasCaro= listaTienda.get(i);
			}
			
		}*/
		return productoMasCaro;
	}
	
	public Producto productoMasBarato(){
		double barato = listaTienda.get(0).getPrecioProducto();
		//Producto productoMasBarato=null;
		//no es viable porque ese producto tendria como atributo 
		//double precioProducto su valor por defecto es 0
		Producto productoMasBarato = listaTienda.get(0);
		for (Producto producto : listaTienda){
			if (producto.getPrecioProducto() < barato){
				barato=producto.getPrecioProducto();
				productoMasBarato= producto;
			}
			
		}
		return productoMasBarato;		
	}

	@Override
	public String toString() {
		return "Tienda [listaTienda= " + listaTienda + "]";
	}
	
	
	
	

}
