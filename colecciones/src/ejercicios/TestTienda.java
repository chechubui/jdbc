package ejercicios;

import java.util.Scanner;

public class TestTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id =0;
		Tienda tienda= new Tienda();
		tienda.addProducto(new Producto(id++, "CD" , 3));
		//otra forma de hacerla
		Producto p1 = new Producto(id++, "DVD", 6);
		tienda.addProducto(p1);
		tienda.addProducto(new Producto(id++, "lector CD" , 5));
		//otra forma de hacerla
		Producto p2 = new Producto(id++, "lector DVD", 12);
		tienda.addProducto(p2);
		System.out.println(tienda);
		System.out.println("Producto mas Barato "+tienda.productoMasBarato());
		System.out.println("Producto mas Caro "+tienda.productoMasCaro());
		
		Scanner in = new Scanner(System.in);
		while(true){
			String nombreProducto = in.next();
			if (nombreProducto.equals("exit"))
				break;
			double precioProducto = in.nextDouble();
			tienda.addProducto(new Producto(id++,nombreProducto,precioProducto));
			
		}
		in.close();
		//System.out.println(tienda);
		
		//eliminar un producto de la tienda
		tienda.eliminarProducto(p1);
		tienda.eliminarProducto(tienda.getListaTienda().get(0));
		System.out.println(tienda);
	}

}
