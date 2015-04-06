package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto= "esto es un texto que vamos a enviar al fichero\n";
		File inFile = new File("C:/Users/mañana/Desktop/IO/nombres_mujer.txt");
		File outFile = new File("C:/Users/mañana/Desktop/IO/nombres_mujer_back_back_back.txt");
		//vamos a añadir a un flujo de salida el String texto y las diez primera lineas de inFile
		//trabajamos try-catch con jdk7
		
		try(BufferedReader in = new BufferedReader(new FileReader(inFile));
				PrintWriter out= new PrintWriter(new FileOutputStream(outFile)))
		{
			//uso readLine que suministra BufferedReader en la lectura del fichero
			//uso el write para sobreescribir los String
			out.write(texto);
			//vamos a añadir 10 lineas de nombre_mujeres
			String lineaLeida;
			for (int i = 0; i < 10; i++) {
				lineaLeida = in.readLine();
				if(lineaLeida==null)break;
				out.write(lineaLeida+"\n");
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Terminada lectura/escritura");
	}

}
