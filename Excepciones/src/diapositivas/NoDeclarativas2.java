package diapositivas;

import java.util.Scanner;

public class NoDeclarativas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hacemos una programacion segura para evitar lo anterior
		//si intentamos acceder a una posicon que no existe, el programa
		//debe terminar con un codigo de error
		int[] numeros={0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el numero");
		int posicion = in.nextInt();
		if(posicion>=numeros.length || posicion<0){
			//situacion de excepcion
			System.out.println("Intentado acceder a una posicion inexistente");
			//salimos con código de error
			in.close();
			System.exit(1);
			
		}
		//desarrollo del programa
		System.out.println("Valor del array en esa posicion es : "+numeros[posicion]);
		//resto de código
		in.close();
		
	}

}
