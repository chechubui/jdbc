package diapositivas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeeFichero {
	private File archivo;
	private String palabraLeida="";
	//Constructor
	public LeeFichero(File archivo) {
		this.archivo = archivo;
	}
	public String getArchivo(){
		 try {
			Scanner in = new Scanner(this.archivo,"UTF-8");
			int contador=0;
			while(in.hasNext()){
				palabraLeida += in.next()+" ";
				contador++;
				if (contador%10 ==0) {
					palabraLeida += "\n";
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return palabraLeida;
	}
	
}
