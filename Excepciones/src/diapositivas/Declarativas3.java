package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

	

public class Declarativas3 {
	//trbajando con IOExcepcion oara java pre jdk 1.7
	public static void main(String[] args) {
	 //vamos a leer un fcihero de texto y lo mostramos por pantalla
	 //la clase Scanner es la mas adecuada
	 File inFile = new File("C:/Users/mañana/Desktop/IO/out.txt");
	 File outFile = new File("C:/Users/mañana/Desktop/IO/out_back_back_back2.txt");
	 Scanner in=null;
	 BufferedWriter out=null;
	 try {
		in = new Scanner(inFile);
		out = new BufferedWriter(new PrintWriter(outFile));
		String palabra;
		while(in.hasNext()){
			palabra =in.next();
			System.out.println(palabra.toUpperCase());
			out.write(palabra.toUpperCase()+" ");
		}
	 } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }catch (IOException e) {
		// TODO: handle exception
	}finally{
		System.out.println("El bloque Finally se ejecuta siempre");
		if (in !=null)in.close();
		if(out !=null) 
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	}

}
