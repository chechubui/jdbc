package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Libro> lista = new ArrayList<Libro>(); //lista de lirbos

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
		System.out.println(lista);
	}

}
class Libro{
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
	

}
