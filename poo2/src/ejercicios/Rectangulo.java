package ejercicios;

public class Rectangulo {
	//atributos
	private double alto;
	private double ancho;
	//variable de clase (static)
	private static int numeroRectangulos=0;
	
	
	//constructor pordefecto donde podemos variar el valor
	/**
	 * @param alto
	 * @param ancho
	 */
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
		numeroRectangulos++;
	}
	
	//otro constructor con valores por defecto
	public Rectangulo(){
		this.alto=1;
		this.ancho=1;
		numeroRectangulos++;
	}
	
	
	//metodo area
	public double getArea(){
		return this.alto*this.ancho;
	}
	
	//metodo perimetro
	public double getPerimetro(){
		return this.alto*2+this.ancho*2;
	}
	
	/**
	 * @return the numeroRectangulos
	 */
	public static int getNumeroRectangulos() {
		return numeroRectangulos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto + ", ancho=" + ancho + "]";
	}

	
	
	public static void main(String[] args) {
		Rectangulo r1= new Rectangulo();
		System.out.println(r1);
		Rectangulo r2 = new Rectangulo(12,1);
		new Rectangulo(); // rectangulo de referencia anonima
		System.out.println(r2);
		System.out.println("Numero de rectangulos: "+Rectangulo.getNumeroRectangulos());
	}
}
