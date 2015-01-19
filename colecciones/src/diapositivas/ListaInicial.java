package diapositivas;

import java.util.ArrayList;

public class ListaInicial {
	public static void main(String[] args){
		//creamos una lista vacia
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("tamaño de la lista: "+list.size());
		list.add("Madrid");
		list.add("Londres");
		list.add("Roma");
		list.add("Jaen");
		//preguntamos si estamos en esa ciudad
		System.out.println("Estas en Madrid? "+list.contains("Madrid"));
		
		//añadimos una ciudad en la posicion 2 y las otras se corren de lugar
		list.add (3, "Berlin");
		
		//localizamos la poscion en la que esta Jaen
		System.out.println ("Posicion de Jaen " + list.indexOf ("Jaen"));
		
		//Indicamos el numero de objetos de la lista
		System.out.println ("Tamaño de la lista: " + list.size ());
		
		//quitamos una ciudad que en este caso es Madrid
		list.remove(0);
		System.out.println("Estas en Madrid? "+list.contains("Madrid"));
		
		//Vemos el contenido de la lista (No hace falta poner el toString ya que "list" es el objeto)
		System.out.println (list.toString ());
		
		
		
	}

}
