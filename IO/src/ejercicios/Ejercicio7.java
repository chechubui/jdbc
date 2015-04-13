package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//descriptor del fichero de texto
		String path= "C:/Users/mañana/Desktop/Ejer_IO/ejercicio6_7/";
		File inFile1 = new File(path+"Cadena1.java");
		File inFile2 = new File(path+"Cadena2.java");
		//ficheros de salida
		File outFile = new File(path+"Cadena_back.java");
		try(BufferedReader in1= new BufferedReader(
				new FileReader(inFile1));
					BufferedReader in2= new BufferedReader(
						new FileReader(inFile2));
					BufferedWriter out = new BufferedWriter(
						new FileWriter(outFile))) {
			//vamos a leer String con readLine
			String linea="";
			String texto="";
			//leemos el primero fichero desde stream in1
			while((linea = in1.readLine())!=null)
				texto+=linea+"\n"; //añadimos un salto de linea a cada String
			String definitivo1=texto.substring(0, texto.length()-1);
			
			//arriba se ha quitado el ultimo salto de linea
			//aprovechamos linea u definitivo1
			while((linea = in2.readLine())!=null)
				definitivo1+=linea+"\n";
			String definitivo2=definitivo1.substring(0, definitivo1.length()-1);
			out.write(definitivo2);
			out.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
