package ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos el File de salida
		File outFile1 = new File("C:/Users/mañana/Desktop/Ejer_IO/FileOutputSteam.txt");
		File outFile2 = new File("C:/Users/mañana/Desktop/Ejer_IO/DataOutputSteam.txt");
		//añadimos un buffer intermedio para mejorar el rendimiento del programa
		//usamos estilo jdk 1.7 se cierran los files solos
		try(BufferedOutputStream out1 = new BufferedOutputStream (new FileOutputStream(outFile1));
				DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(
						new FileOutputStream(outFile2)))){
			//añadimos los veinte numero al fichero
			for(int i=20; i <41 ;i++){
				out1.write(i);
				out2.writeInt(i);
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
