package diapositivas;

import java.util.Scanner;

public class NoDeclarativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vamos a definir un array(tamño fijo)
		//usamos la clase Scanner para solicitar una posicion
		int[] numeros={0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el numero");
		//vamos a introducir una posicion no existente en el array
		int posicion = in.nextInt();
		System.out.println("el valor de la posicion es :"+numeros[posicion]);
		
		
		//lo que no se debe hacer
		//la excepciones no declarativas no deben convertirse en declarativas
		/*try{
			posicion= in.nextInt();
			System.out.println("el valor de la posicion es :"+numeros[posicion]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Esa posicion del array no existe\n");
			e.printStackTrace();
		}*/
			in.close();
	}

}
