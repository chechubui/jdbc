package diapositivas;

import java.util.Scanner;

public class NoDeclarativas4 {

	public static int[] numeros = {0,1,2,3,4,5,6,7,8,9};
	public static Scanner in= new Scanner(System.in);
	public static int posicion; //se inicializa a 0
	public static boolean flag; //se inicializa a false por defecto
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(!flag){ // not flag (cambia el valor del flag)
			posicion=getPosicion(); //se repite hasta que flag sea true
		}
		System.out.println("Posicion del array : "+numeros[posicion]);
		in.close();
	}
	public static int getPosicion(){
		System.out.println("Indica la posicion del array");
		posicion = in.nextInt();
		
		if (posicion < numeros.length)
			flag=true;
		return posicion;
	}

}
