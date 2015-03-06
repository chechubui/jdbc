package diapositivas;

public class InstanciaEstatico {
	public final int CONSTANTE = 5;
	public static final int OTRA_CONSTANTE = 7;
	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(10);
		Cuadrado c2 = new Cuadrado(20);
		System.out.println("Valor de la arista: "+c1.getArista());
		System.out.println("Numero de cuadrados: "+c1.getNumeroCuadrados());
		
		//mejor al ser un miembro estatico
		System.out.println("Numero de cuadrados: "+Cuadrado.getNumeroCuadrados());
		
		//System.out.println("Valor de la Constante: "+CONSTANTE);
		InstanciaEstatico i = new InstanciaEstatico();
		System.out.println("Valor de la Constante: "+i.CONSTANTE);
		
		//mejor crear la constante como static
		System.out.println("Valor de la otra constante"+OTRA_CONSTANTE);
		
		//Accedemos al metodo instancia version1
		//debemos crear un objeto o aprovechar alguno que exista
		InstanciaEstatico nuevoObjeto = new InstanciaEstatico();
		System.out.println("numero aleatrio "+nuevoObjeto.version1());
		
		//accedemos al metodo de clase version2
		//no hace falta crear o usar un objeto  aunque se puede usar
		System.out.println("Numero aleatorio : "+InstanciaEstatico.version2());
		//otra forma seria
		System.out.println("Numero aleatorio2: "+nuevoObjeto.version2());
	
	
	}
	public int version1(){
		return (int) (Math.random()*100);
	}
	public static int  version2(){
		return (int) (Math.random()*100);
	}
}

class Cuadrado{
	private int arista;
	private static int numeroCuadrados=0;
	/**
	 * @param arista
	 */
	public Cuadrado(int arista) {
		this.arista = arista;
		numeroCuadrados++;
	}

	public int getArista() {
		return arista;
	}

	public void setArista(int arista) {
		this.arista = arista;
	}

	public static int getNumeroCuadrados() {
		return numeroCuadrados;
	}

	public static void setNumeroCuadrados(int numeroCuadrados) {
		Cuadrado.numeroCuadrados = numeroCuadrados;
	}

	@Override
	public String toString() {
		return "Cuadrado [arista=" + arista + "]";
	}
	
	/*public static int aristaPorDos(){
		return this.arista*2;
	}*/
	
	
}