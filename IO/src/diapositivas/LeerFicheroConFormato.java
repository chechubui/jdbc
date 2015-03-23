package diapositivas;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerFicheroConFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fichero de entrada
		File inFile = new File("C:/Users/mañana/Desktop/nombres_mujer.txt");
		//stream elegifdo : DataInputStream porque tiene datos con formato
		//en este caso String
		DataInputStream in = null;
		
		//abrimos el stream
		try {
			in = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(inFile)));
			String leido;
			while((leido=in.readLine())!=null) //no se una porque tenemos clases de stream para character streamreader
				System.out.println(leido);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in!= null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	}
}
