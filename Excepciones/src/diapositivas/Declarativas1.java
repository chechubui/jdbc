package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//vamos a leer un fcihero de texto y lo mostramos por pantalla
		//la clase Scanner es la mas adecuada
		File inFile = new File("C:/Users/mañana/Desktop/IO/out.txt");
		Scanner in = new Scanner(inFile);
		//vamos a escribir a un fichero de texto de salida
		File outFile = new File("C:/Users/mañana/Desktop/IO/out_back.txt");
		//la clase PrintWriter es adecuada
		BufferedWriter out = new BufferedWriter(new PrintWriter(outFile));
		//leemos palabra a palabra, usamos el método next()
		String palabra;
		while(in.hasNext()){
			palabra=in.next();
			System.out.println(palabra.toUpperCase());
			out.write(palabra.toUpperCase()+" \n \n ");
		}
		if (in !=null)in.close();
		if(out !=null)out.close();
		
		
	}

}
