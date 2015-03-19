package ejercicios;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo r1= new Rectangulo();
		System.out.println(r1);
		Rectangulo r2 = new Rectangulo(12,1);
		new Rectangulo(); // rectangulo de referencia anonima
		System.out.println(r2);
		System.out.println("Numero de rectangulos: "+Rectangulo.getNumeroRectangulos());
	}
}
