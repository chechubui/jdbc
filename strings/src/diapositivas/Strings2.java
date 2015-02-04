package diapositivas;

import java.util.Scanner;

/*Leer con Scanner un linea completa
 * Hay 1 coche en la cochera1
 * 1- Indicar si la linea tiene algun numero
 * 2- indicar cuantas palabras tienen numero
 * 3- Indicar cuantos numeros hay en la frase
 * 4- Indicar cuantas palabras empiezen por vocal*/
public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la frase");
		String frase = in.nextLine();
		System.out.println(frase);
		in.close();
		
		//la expresion regular es ;.*[0-9]+.*
		//. es cualquier caracter excepto el salto de linea
		//* es cero o mas
		// + es 1 o mas
		
		//1- Indicar si la linea tiene algun numero

		System.out.println("Tiene numero la frase =  "+frase.matches(".*[0-9]+.*"));
		System.out.println("==================================");
		
		//2-indicar cuantas palabras tienen numero
		String[] array =frase.split(" ");
		int contador=0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
			
			if(array[i].matches(".*[0-9]+.*"))
				contador++;	
		}
		System.out.println("Hay  "+contador+" palabras que tienen numero ");
		
		System.out.println("==================================");
		
		//3- Indicar cuantos numero hay en esa frase
		int contador1=0;
		for (int i = 0; i < frase.length(); i++) {
			System.out.print(frase.charAt(i)+" ");
			if(Character.isDigit(frase.charAt(i)))
				contador1++;	
		}
		System.out.println("\nHay "+contador1+" numeros ");
		System.out.println("==================================");
		
		//4-Indicar cuantas palabras empiezan por vocal
		int contador2=0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
			
			if(array[i].toLowerCase().matches("[aeiou]+.*"))
				contador2++;
		}
		System.out.println(contador2);
	
	
	}

}
