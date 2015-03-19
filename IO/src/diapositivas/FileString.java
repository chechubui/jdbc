package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileString {
	public static void main(String[] args) {
		//recepcionar un flujo de bytes desde un archivo
		//escogemos como inputstream FileInputStream
		//previamente debemos de crear un objeto de tipo FIle
		File inFile = new File("C:/Users/mañana/Desktop/out.txt");
		FileInputStream in = null;
		String TextoARecibir="";
		try {
			in = new FileInputStream(inFile);
			int c;
			while((c=in.read())!=-1){
				TextoARecibir+=(char)c;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(in !=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println(TextoARecibir);
	}
}
