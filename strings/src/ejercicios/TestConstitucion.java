package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<String> listaConstitucion = new ArrayList<String>();
		StringBuilder lista500Palabras = new StringBuilder();
		Scanner in = new Scanner(new File("constitucion.txt"));
		String palabras="";
		while(in.hasNext()){
			palabras=in.next();
			if(palabras.matches(".*[\\p{Punct}]$"))
				listaConstitucion.add(palabras.substring(0,palabras.length()-1));
			else
				listaConstitucion.add(palabras);
		}
		in.close();
		
		for (int i = 0; i < listaConstitucion.size(); i++) {
			System.out.println(i+")"+listaConstitucion.get(i));
		}
		
		for (int i = 0; i < 500 ; i++) {
			int aleatorio = (int) (Math.random()*listaConstitucion.size());
			lista500Palabras.append(listaConstitucion.get(aleatorio)+" ");
		}
		System.out.println(lista500Palabras);
		
		
		
	}

}
