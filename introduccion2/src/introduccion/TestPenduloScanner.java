package introduccion;

import java.util.Scanner;

public class TestPenduloScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Escribe la longitud: ");
		double longitud= in.nextDouble();
		Pendulo p= new Pendulo(longitud);
		System.out.println(p);
		System.out.println("El periodo es = "+p.periodo()+ " segundos");
		in.close();
	}

}
