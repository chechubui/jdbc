package ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos los ficheros de entrada
		File inFile1 = new File("C:/Users/mañana/Desktop/Ejer_IO/FileOutputSteam.txt");
		File inFile2 = new File("C:/Users/mañana/Desktop/Ejer_IO/DataOutputSteam.txt");
		//creamos los stream con estilo jdk 1.7
		//usamos un buffer para mejorar el rendiimiento
		try (BufferedInputStream in1 = new BufferedInputStream(new FileInputStream(inFile1));
		DataInputStream in2= new DataInputStream(new BufferedInputStream(new FileInputStream(inFile2)))){
		//hacemos la lectura
			System.out.println("Caso de  FileInputStream");
			int c;
			while((c=in1.read())!=-1){
				System.out.print(c+" - ");
			}
			
			System.out.println("\nCaso de DataInputStream");
			//usamos un metodo avaible() que nos indica el numero de bytes que quedan por leer
			while(in2.available()!=0){
				System.out.print(in2.readInt()+" - ");
				/*if (in2.available()==0)
					break;*/
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
