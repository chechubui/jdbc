/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Jesus Buitrago
 * 6/02/2015
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String texto="";
		String palabra="";
		int numeroPalabras=0;
		while(in.hasNext()){ //mientras haya String que leer
			palabra= in.next();//se lee un nombre
			numeroPalabras++;
		//texto+=palabra;
			
		}
		
		in.close();
		System.out.println("Palabras Leidas : "+numeroPalabras);
	}

}
