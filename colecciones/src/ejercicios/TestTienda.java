package ejercicios;

import java.util.Scanner;

public class TestTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id =0;
		Tienda tienda= new Tienda();
		tienda.addProducto(new Producto(0, "CD" , 3));
		//otra forma de hacerla
		Producto p1 = new Producto(1, "DVD", 6);
		tienda.addProducto(p1);
		tienda.addProducto(new Producto(2, "lector CD" , 5));
		//otra forma de hacerla
		Producto p2 = new Producto(3, "lector DVD", 12);
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
		System.out.println(tienda);
		
	}

}
