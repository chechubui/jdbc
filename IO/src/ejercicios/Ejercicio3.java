package ejercicios;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File outFile = new File("C:/Users/mañana/Desktop/Ejer_IO/ejercicio3.txt");
		//creamos el stream reader para volcar los datos
		try (PrintWriter out = new PrintWriter(
				new BufferedOutputStream(
						new FileOutputStream(outFile)),true);){
		//escribimos los datos:
		for(int i = 250;i<271; i++)
			out.println(i);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//vamos a leer el fichero
		//no hace falta crear un nueevo file
		//si hay que crear un nuevo flujo de entrada
		try (BufferedReader in = new BufferedReader(
					new FileReader(outFile));){
			String c="";
			while((c=in.readLine())!=null)
				System.out.print(c+" - ");
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
