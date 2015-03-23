package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReader1 {
	public static void main(String[] args) {
		File inFile = new File("C:/Users/mañana/Desktop/IO/nombres_mujer.txt");
		File outFile = new File("C:/Users/mañana/Desktop/IO/nombres_mujer_back.txt");
		
		BufferedReader in= null;
		BufferedWriter out = null;
		
		
		try {
			in = new BufferedReader (new FileReader(inFile));
			out = new BufferedWriter (new FileWriter(outFile));
			int c;
			while((c=in.read())!=-1)
				out.write(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
