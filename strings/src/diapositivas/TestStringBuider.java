package diapositivas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestStringBuider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear un stringbuilder a partir de string que leemos a partir del Scanner
		//leemos hasta que introduzcamos "quit"
		
		Scanner in = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		//leer desde un Scanner , 1º crear una variable que recoja los datos, en este caso los datos son String
		
		String aux = null;
		System.out.println("Introduce las palabras , quit para salir");
		while(true){
			aux=in.next();
			if (aux.equalsIgnoreCase("quit"))
				break;
			//añadimos el stringBuilder para no añadir QUIT
			stringBuilder.append(aux+" ");
			//falta crear un filtro , si cumple los requisitos se añade
			if (Auxiliar.requisitos(aux))
				stringBuilder.append(aux+" ");
			
			
		}
		in.close();
		System.out.println("Cerrado Scanner");
		System.out.println("Contenido del StringBuilder:\n"+stringBuilder);
		
		//le damos la vuelta al stringbuilder
		stringBuilder.reverse(); //¿Es mutante?
		System.out.println("Contenido del StringBuilder:\n"+stringBuilder);
		//ees mutante pero tengo rl problema de un espacio en blanco

		//quitamos el espacio en blanco
		stringBuilder.deleteCharAt(0);
		System.out.println("Contenido del StringBuilder:\n"+stringBuilder);
		
		System.out.println("=================");
		//convertir el StringBuilder a String
		String s1 = stringBuilder.toString();
		
		//guarmaos en un  array de String usando el delimitador
		String[] array = s1.split(" ");
		//comprobamos el contenido del array
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+")"+array[i]);
		}
		
		//hay que convertir a ArrayList
		List<String> lista1 = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			lista1.add(array[i]);
		}
		//vemos su valor
		System.out.println(lista1);
		
		
		System.out.println("=================");
		//existe un metodo que convierte los array en List
		List<String> lista2 = Arrays.asList(array);
		System.out.println(lista2);

		
		
		
	}	
}
