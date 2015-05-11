package ejercicio1;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos los objetos
		PoligonoRegular t1 = new TrianguloEquilatero("Triangulo Equilatero 1", 3, 3);
		PoligonoRegular c1 = new Cuadrado("Cuadrado", 4, 3);
		PoligonoRegular h1 = new Hexagono("Hexagono",6, 3);
		
		List<PoligonoRegular> lista = new ArrayList<PoligonoRegular>();
		lista.add(t1);
		lista.add(c1);
		lista.add(h1);
		
		//usamos un bucle mejorado para llamar al toString,getArea y getPerimetro
		
		for (PoligonoRegular poligonoRegular : lista) {
			System.out.println(poligonoRegular +"\n area "+poligonoRegular.getArea()+"\n perimetro "+poligonoRegular.getPerimetro()+"\n");
		}
		
		PoligonoRegular t2 = new TrianguloEquilatero("Triangulo Equilatero 2", 3, 3);
		PoligonoRegular t3 = new TrianguloEquilatero("Triangulo Equilatero 3", 3, 4);
		PoligonoRegular t4 = new TrianguloEquilatero("Triangulo Equilatero 4", 3, 5);
		lista.add(t2);lista.add(t3);lista.add(t4);
		
		for (PoligonoRegular poligonoRegular : lista) {
			if (poligonoRegular.equals(lista.get(0)))
				System.out.println(poligonoRegular+"Es igual a "+lista.get(0));
		}
		System.out.println(" ");
		
		for (PoligonoRegular poligonoRegular : lista) {
			System.out.println(poligonoRegular+" comparando con  "+lista.get(0)+" "+poligonoRegular.compareTo(lista.get(0)));
		}
		
		}

}
