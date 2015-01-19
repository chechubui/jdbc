package diapositivas;

import java.util.ArrayList;
import java.util.List;


public class RecorrerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos la lista de Integer vacia
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int[] arrayEnteros = {1,2,3,4,5,6,7,8,9};
		//recorro el array y lo añado a la lista
		for (int i = 0; i < arrayEnteros.length; i++) {
			lista.add(arrayEnteros[i]);
			
		}
		System.out.println(lista);
		Integer numero1 = new Integer(10);
		lista.add(0,numero1); // añado el numero a la posicion cero
		System.out.println(lista);
		//con .set machaco lo que hay en esa posicion
		Integer numero2 = new Integer(100);
		lista.set(0,numero2);
		System.out.println(lista);
		
		//recorremos la lista para saber que numero son pares y cuales son impares
		int contadorPares=0;
		for (int i = 0; i < lista.size(); i++) {
			if((lista.get(i) % 2) ==0)
				contadorPares++;
			
		}
		System.out.println("La cifra de numeros pares son = "+contadorPares);
		//vamos a encontrar numeros impares
		
		List<Integer> listaImpares = new ArrayList<Integer>();
		for (Integer integer : lista) {
			if (0 != (integer %2))
				listaImpares.add(integer);
		}
		System.out.println("Lista de impares "+listaImpares);
 		
		
	}

}
