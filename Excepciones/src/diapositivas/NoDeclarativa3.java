package diapositivas;

import java.util.Scanner;

public class NoDeclarativa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros={0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el numero");
		int posicion = in.nextInt();
		if(posicion>=numeros.length || posicion<0){
			//volvemos a solicitar la posicion
			System.out.println("Introduce el numero");
			posicion = in.nextInt();
			if (posicion>=numeros.length || posicion<0){
				System.out.println("posicion inexistente");
				System.exit(1);
			}	
			else{
				System.out.println("Valor del array en esa posicion es : "+numeros[posicion]);
			}
		}
		else 
			System.out.println("Valor del array en esa posicion es : "+numeros[posicion]);
		in.close();
	}

}
