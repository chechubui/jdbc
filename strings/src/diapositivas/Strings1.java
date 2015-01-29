package diapositivas;


public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 ="Hola mundo";
		String string2 ="Hola mundo";
		String string3 =new String ("Hola mundo");
		String string4=new String(new char[]{'H','o','l','a',' ','m','u','n','d','o'});
		
		//usamos el comparador ==
		//aqui comparamos referencias(posicion de memoria)
		System.out.println(string1 == string2);
		System.out.println(string1 == string3);
		System.out.println(string1 == string4);
		System.out.println(string3 == string4);
		System.out.println("\n");
		
		//usamos el metodo equals
		System.out.println(string1.equals(string2) );
		System.out.println(string1.equals(string3) );
		System.out.println(string1.equals(string4) );;
		System.out.println(string3.equals(string4) );
		System.out.println("\n");
		
		//usamos el metodo compareTo
		System.out.println(string1.compareTo(string2) );
		System.out.println(string1.compareTo(string3) );
		System.out.println(string1.compareTo(string4) );
		System.out.println(string3.compareTo(string4) );
		System.out.println(string1.compareTo(string2.toUpperCase()) );
		System.out.println(string2);//¿Se ha convertido en mayuscula todo?
		string2.toUpperCase(); // no es un metodo mutante
		System.out.println(string2); // ¿Y ahora?
		String auxiliar= string2.toUpperCase();
		System.out.println(auxiliar); // el nuevo objeto si está cambiado a mayusculas
		System.out.println("==================================");
		
		System.out.println(string1.startsWith("Hola"));//te dice si empieza por eso
		System.out.println(string1.endsWith("mundo".trim())); //.trim quita espacios en blanco al principio al final
		System.out.println("==================================");
		//probamos los metodos length , concat , charAT
		System.out.println(string1.length()); //tamaño 10, de 0 a 9
		System.out.println(string1.concat(" ").concat(string4));
		
		
		System.out.println(string1+" "+string4);
		for (int i = 0; i < string1.length(); i++) {
			System.out.print(string1.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("==================================");
		//damos la vuelta al string
		for (int i = string1.length()-1; i >= 0 ; i--) {
			System.out.print(string1.charAt(i)+" ");
			
		}
		System.out.println();
		
		//recorrer el string y imprimir solo lo que hay despues del espacio
		System.out.println("==================================");
		String palabra = null; 
		for (int i = 0; i < string1.length(); i++) {
			System.out.print(string1.charAt(i)+" ");
			
			if(string1.charAt(i)==' '){//le decimos que cuando haya un espacio entre en el if
				//hacemos una variable nueva y le metemos el string1 haciendo un subs y te imprime desde donde empieza
				//el espacio hasta el final de la cadena
				 palabra = string1.substring(i+1,string1.length() );//se pone el +1 para que nos salte el espacio
				 // y nos imprima solo Mundo ,el  string1.length() se puede quitar porque eso nos dice
				 // que nos imprima hasta final de cadena
				 
			}
		}
		System.out.println("\n");
		System.out.println(palabra);
		System.out.println("==================================");
		
		//remplazar letras
		System.out.println(string1.replace('o', 'O'));// cambia todos los caracteres de esa letra
		System.out.println(string1);//no mutante, cambia todos los caracteres de esa letra
		System.out.println(string1.replace("Hola", "Hello"));
		
		
		System.out.println("==================================");
		System.out.println(string1.replaceAll("[aeiou]", "*"));//rempalaza las letras por *
		System.out.println(string1.replaceFirst("[aeiou]", "*")); // cambia la primera que encuentre
		System.out.println("==================================");
		
		//probamos el metodo split
		String[] array = string1.split(" ");//separamos por espacio  en blanco la palabra
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
		}
		
		System.out.println("==================================");
		
		//separamos por vocales
		array = string1.split("[aeiou]");//separamos por espacio  en blanco la palabra
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
		}
		
		
		
		
		
	}

}
