package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stream de entrada String --> byteArrayInputStream
		String frase = "esto es una frase \n con la ñ";
		//convertimos a un array de byte
		byte[] array = frase.getBytes();
		//creamos el imputStream
		ByteArrayInputStream in = new ByteArrayInputStream(array);
		// vamos a volcarese flujo de byte (stream) a un archivo
		//Primero creamos el archivo
		//String path="C:\Users\mañana\Desktop\out.txt";
		//File outFile= new File(path);
		File outFile= new File("C:/Users/mañana/Desktop/out.txt");
		//creamos el flujo de byte de salida outputstream
		//obviamente sera un  FileOutputStream
		FileOutputStream out =null;
		try {
			out = new FileOutputStream(outFile);
			int c;
			while((c=in.read())!=-1){
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(out!= null)
				try{
					out.close();
				}catch (IOException e1){
					e1.printStackTrace();
				}
			if(in!=null)
				try{
					in.close();
				}catch (IOException e){
					e.printStackTrace();
				}
		}
		
	}

}
