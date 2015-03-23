package diapositivas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFicheroConBuffer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File infile = new File("C:/Users/mañana/Desktop/prueba.rar");
		 File outFile = new File("C:/Users/mañana/Desktop/prueba2.rar");
		 //Usamos FileInputStream y  FileOutputStream
		 BufferedInputStream in = null;
		 BufferedOutputStream out = null;
		 //inicializamos los dos stream
		 try {
			in = new BufferedInputStream(new FileInputStream(infile));
			out = new BufferedOutputStream(new FileOutputStream(outFile));
			long inicio=System.nanoTime(); // comprobar el tiempo de que tarda inicialmente
			//procedemos a la lectura del inputStream
			int c; //recoge los bytes uno a uno
			//hasta encontar -1 que es el fin del stream
			while((c=in.read())!=-1){
				//lo he leido del inputStream lo llevamos al outputstream
				//para eso escribimos con el metodo write
				out.write(c);
			}
			long fin =System.nanoTime();
			System.out.println("Fichero copiado en "+(fin-inicio)/1_000 +"ns");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{//cerrramos los stream
			 if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 if(out != null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		
		
	
		 
	}

}
