package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class TestFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos los objetos
		Figure f1 = new TrianguloEquilateroFigure(5);
		Figure f2 = new TrianguloIsoscelesFigure(3, 4);
		Figure f3 = new ElipseFigure(3, 4);
		Figure f4 = new CircunferenciaFigure(3);
		
		List<Figure> lista = new ArrayList<Figure>();
		lista.add(f1);lista.add(f2);lista.add(f3);lista.add(f4);
		//recorremos la colección lista uy mostramos nombre y perimetro
		for (Figure figure : lista) {
			System.out.println(figure.getNombre()+"----"+figure.getPerimetro());
			System.out.println("-----------------------------");
			System.out.println(figure.getTodo());
			System.out.println("-----------------------------");
		}
		//¿Se pueden crear objetos de tipo Figure?(usando new Figure)
		//Figure f5 = new Figure si como objeto de clase anonima 
		//¿Y de circulasfigure?
		//CirculasFigure f6 = new CirculasFigure   ocurre igual

		
	}

}
