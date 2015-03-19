package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;

public class ImputStreamBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase1 = "esto";
		StringBufferInputStream in1 = new StringBufferInputStream(frase1);
		int c;
		c=in1.read(); System.out.println(c+" "+(char)c);
		c=in1.read(); System.out.println(c+" "+(char)c);
		c=in1.read(); System.out.println(c+" "+(char)c);
		c=in1.read(); System.out.println(c+" "+(char)c);
		c=in1.read();System.out.println(c);
		try {
			in1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==========================");
		
		
		//leer todos 
		String frase = "esto es con una ñ @";
		StringBufferInputStream in2 = new StringBufferInputStream(frase);
		while((c=in2.read()) !=-1){
			System.out.println(c+" "+(char)c);
		}
		try {
			in2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=====================");
		
		
		String frase3="esto es una frase ñ";
		byte[] arrayBytes = frase3.getBytes();
		//System.out.println(arrayBytes[0]+" "+(char)arrayBytes[0]);
		ByteArrayInputStream in3 = new ByteArrayInputStream(arrayBytes,2,100);
		while((c=in3.read()) !=-1){
			System.out.println(c+" "+(char)c);
		}
		try {
			in3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
