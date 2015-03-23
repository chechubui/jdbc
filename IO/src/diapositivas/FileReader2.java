package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//solo para archivos de texto
		File inFile = new File("C:/Users/mañana/Desktop/IO/nombres_mujer.txt");
		File outFile = new File("C:/Users/mañana/Desktop/IO/nombres_mujer_back_back.txt");
		
		
		//Lectura del mismo 
		//trabajando con jdk7 no s permiite iniciar los streamen el bloque try/catch
		//y no hace falta cerrarlos en un bloque finally
		
		try(BufferedReader in = new BufferedReader(new FileReader(inFile));
				BufferedWriter out = new BufferedWriter(new FileWriter(outFile))){
			String lineaLeida;
			while((lineaLeida=in.readLine())!=null)
				out.write(lineaLeida+"\n");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Termina el programa");
	}

}
