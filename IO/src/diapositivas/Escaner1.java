package diapositivas;

import java.io.File;
import java.util.Scanner;

public class Escaner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("C:/Users/mañana/Desktop/IO/hola.txt");//lo lee bien
		//File inFile = new File("C:/Users/mañana/Desktop/IO/hola.txt"); te mete caracteres raros porque estamos usando 
		//codificacion UTF-8
		try (Scanner in = new Scanner(inFile,"ISO-8859-1");) {
			String valorLeido;
			while(in.hasNext()){
				valorLeido = in.next();
				System.out.println(valorLeido);
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
