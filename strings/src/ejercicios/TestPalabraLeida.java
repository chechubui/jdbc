package ejercicios;

import java.util.Scanner;



public class TestPalabraLeida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la frase");
		String palabra = in.nextLine();
		in.close();
		PalabraLeida v= new PalabraLeida(palabra);
		
		System.out.println("La palabra escrita es = "+palabra);
		System.out.println("Longitud de la palabra "+ v.numeroDeLetras());
		System.out.println("¿Empieza por vocal? "+v.empiezaVocal());
		System.out.println("¿Termina en vocal? "+v.terminaVocal());
		System.out.println("Contiene "+v.numeroVocales()+ " vocales");
		System.out.println("¿Contine la letra H? "+v.contieneH());
		System.out.println("¿Es un palindromo? "+v.esPalindromo());
		if(args.length>0){
			System.out.println("¿Son las palabras iguales?" +v.sonIguales(args[0]));
		}
		
		
		
	}

}
