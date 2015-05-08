package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Declarativas4 {
	public static void main(String[] args) {
		 File inFile = new File("C:/Users/mañana/Desktop/IO/out.txt");
		 File outFile = new File("C:/Users/mañana/Desktop/IO/out_back_back_back3.txt");
		 //vamos a trabajar con JDK 7
		 //declaramos los stream fuera del try
		 //no hace falta finally para cerrar, se cierran solos
		 
		 try(Scanner in = new Scanner(inFile);
				 BufferedWriter out = new BufferedWriter(
						 new FileWriter(outFile))) {
			 String palabra;
			 while(in.hasNext()){
				 palabra=in.next();
				 System.out.println(palabra.toUpperCase());
				 out.write(palabra.toUpperCase()+" ");
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
