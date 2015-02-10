/**
 * 
 */
package ejercicios;

import java.util.ArrayList;
import java.util.List;
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
		//si no hay argumento
		if(args.length == 0){
			Scanner in = new Scanner(System.in);
			//String texto="";
			String palabraLeida="";
			int numeroPalabras=0;
			//crea una lista para introducir String de nombre que empieza por "a"
			List<String> listaEmpiezanPorA = new ArrayList<String>();
			
			//igual que aquellas que no acaban en vocal
			List<String> listaNoAcabanEnVocal = new ArrayList<String>();
			
			List<String> listaPalabrasMayorLongitud = new ArrayList<String>();
			
			List<String> listaPalabrasMenorLongitud = new ArrayList<String>();
			
			int mayorLongitud=0;
			List<String> listaTodasLasPalabras = new ArrayList<String>();
			int menorLongitud=Integer.MAX_VALUE;//tamaño maximo que puede tener un int
			
			
			while(in.hasNext()){ //mientras haya String que leer
				palabraLeida= in.next();//se lee un nombre
				numeroPalabras++;
				listaTodasLasPalabras.add(palabraLeida);
				if(mayorLongitud < palabraLeida.length())
					mayorLongitud = palabraLeida.length();
				
				if(menorLongitud > palabraLeida.length())
					menorLongitud = palabraLeida.length();
				
				if (palabraLeida.startsWith("a"))
					listaEmpiezanPorA.add(palabraLeida);
				
				if(!palabraLeida.matches(".*[aeiuo]$"))
				listaNoAcabanEnVocal.add(palabraLeida);
				
			//texto+=palabra;
				
			}
			
			
			
			in.close();
			System.out.println("Palabras Leidas : "+numeroPalabras);
			//otra forma de contadar las palabras
			System.out.println("Palabras Leidas : "+listaTodasLasPalabras.size());
			System.out.println(listaEmpiezanPorA);
			System.out.println(listaNoAcabanEnVocal);
			System.out.println("Longitud palabra mas pequeña: "+menorLongitud);
			System.out.println("Longitud mayor : "+mayorLongitud);
			for (String palabra : listaTodasLasPalabras){
				if(palabra.length() == menorLongitud)
					listaPalabrasMenorLongitud.add(palabra);
				
				if(palabra.length() == mayorLongitud)
					listaPalabrasMayorLongitud.add(palabra);
			}
			System.out.println(listaPalabrasMayorLongitud);
			System.out.println(listaPalabrasMenorLongitud);
		}
		//en el caso que hay argumentos 
		else{
			//OJO HAY DUPLICIDAD DE CODIGO, lo mas correcto seria reestructurar el programa
			//en principio no lo hacemos
			//compruebo que recoge los argumentos
			//System.out.println("hay argumentos "+args[0]);
			List<String> listaTodasLasPalabras = new ArrayList<String>();
			List<String> listaPalabrasSugerida = new ArrayList<String>();
			String argumento = args[0];
			Scanner in = new Scanner(System.in);
			String palabra="";
			boolean contieneNombre=false;
			//recorremos el Scanner
			while(in.hasNext()){
				palabra=in.next();
				listaTodasLasPalabras.add(palabra);
				if (palabra.equals(argumento)){
					contieneNombre=true;
					System.out.println("Existe en la lista el nombre de "+argumento);
					break; // al estar en la lista se sale de la lista
				}
				/*else 
					System.out.println("No existe la palabra en la lista");*/ 
				//repite que no existe mientras que está en el bucle
						
			}
			in.close();
			if(!contieneNombre){
				System.out.println("No existe la palabra en la lista "+argumento);
				String comienzaPor = argumento.substring(0, 2);
				//recorremos la lista que contiene los nombres
				for(String palabras : listaTodasLasPalabras){
					if(palabras.startsWith(comienzaPor))
						listaPalabrasSugerida.add(palabras);
				}
				System.out.println("Palabras sugeridas"+listaPalabrasSugerida);
			}
		}
		
	}

}
