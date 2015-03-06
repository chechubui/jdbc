package diapositivas;

public class ReferenciaValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicial=6;
		System.out.println("Valor del dato primitivo antes de llamar al metodo "+inicial);
		modificarPrimitivo(inicial);
		System.out.println("Valor del dato primitivo antes de llamar al metodo "+inicial);
		
		Circulo c1 = new Circulo(5.0);
		System.out.println("Posicion de memoria c1 "+c1);
		Circulo c3 = c1;
		c3.setRadio(15);
		System.out.println("Posicion de memoria c3 "+c3);
		modificar(c3);
		System.out.println("Valro del radio c1 "+c1.getRadio());
		System.out.println("Valro del radio c3 "+c3.getRadio());
	}
	public static void modificar (Circulo c2){
		System.out.println("Posicion de memoria c2 "+c2);
		c2.setRadio(25);
		System.out.println("Valro del radio c2 "+c2.getRadio());
		
	}
	public static void modificarPrimitivo(int valorEnElMetodo){
		valorEnElMetodo *=2;
		
	}
}

class Circulo{
	private double radio;

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	//metodo mutante que cambia el valor de un atributo de un objeto
	//un objeto puede estar referenciado en distintas posiciones de la pila.
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	
	
}
