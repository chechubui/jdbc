package diapositivas;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigurasGeometricas f1 = new CuadradoFigura(5);
		FigurasGeometricas f2 = new Rectangulo(5,6);
		FigurasGeometricas f3 = new Circulos(5);
		System.out.println(f1+"\n"+f2+"\n"+f3);
		System.out.println(f1.getArea());
		System.out.println(f2.getArea());
		System.out.println(f3.getArea());
		
	}

}
