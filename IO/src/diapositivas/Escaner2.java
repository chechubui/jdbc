package diapositivas;

import java.util.Scanner;

public class Escaner2 {
	public static void main(String[] args) {
		String frase = "juan:fernandez:22:\t true:222,22";
		Scanner in = new Scanner(frase);
		in.useDelimiter("\\s*:\\s*");
		String nombre = in.next();
		String apellido = in.next();
		int edad = in.nextInt();
		boolean condicion = in.nextBoolean();
		double pago = in.nextDouble();
		in.close();
		System.out.println(nombre+" "+apellido+" ");
		System.out.println("Edad: "+edad+"\t"+"Condicion "+condicion);
		System.out.println("Pago "+pago);
	}
}
