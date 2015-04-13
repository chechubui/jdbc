package ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Libro> lista = new ArrayList<Libro>(); //lista de lirbos
		//la caracterusticas mas importante de las colecciones Set 
		//es que no pueden repetir objetos que contienen
		Set<Libro> listaDiezLibros = new HashSet<Libro>();
		// creamos el descriptor del fichero
		File inFile = new File("C:/Users/mañana/Desktop/Ejer_IO/librosCopia.csv");
		//creamos el flujo de entrada
		try (BufferedReader in = new BufferedReader(
				new FileReader(inFile));){
			String linea=in.readLine();//leo la primera linea y la desecho
			Libro libro ;//creo la referencia
			while((linea=in.readLine())!=null){
				
				String[] campos= linea.split(";");
				libro = new Libro(campos[0], campos[3], campos[6]);
				lista.add(libro);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(lista);
		//debemos sacar 10 libros al alzar y añadirlos a la nueva lista
		Libro libro;
		do{
			//posicion aleatoria
			int posicionLibroLista = (int) (Math.random()*lista.size());
			//obtenemos libros de la lista
			 libro = lista.get(posicionLibroLista);
			//lo añadimos a la nueva lista
			 listaDiezLibros.add(libro);
			
		}
		while(listaDiezLibros.size() <10);
			//System.out.println(listaDiezLibros);
		//vamos a crear  el objeto de salida
		File outFile = new File("C:/Users/mañana/Desktop/Ejer_IO/libros.dat");
		//
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(outFile)));) {
			out.writeObject(listaDiezLibros);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//vamos a leer los daros del fichero libros.dat
		//hay que crear un stream de entrada
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(outFile)));) {
			//out.writeObject(listaDiezLibros);
		//Object objetoLeido = in.readObject();
		Set<Libro> objetoLeido = (Set<Libro>) in.readObject();
		System.out.println(objetoLeido);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Libro implements Serializable {
	private String titulo;
	private String autor;
	private String isbn;
	
	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		if (autor.equals(""))
			this.autor = "desconocido";
		else
			this.autor = autor;
		this.isbn = isbn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn="
				+ isbn + "]"+"\n";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	

}
