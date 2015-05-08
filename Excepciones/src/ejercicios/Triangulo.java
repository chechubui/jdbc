package ejercicios;


public class Triangulo {
	//la suma de dos lados tiene que ser mayor que un solo lado, para que se forme un triangulo
	//lado1 = a lado2=b y lado3=c
	private int a;
	private int b;
	private int c;
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @throws IlegalTrianguloExcepcion
	 */
	public Triangulo(int a, int b, int c) throws IlegalTrianguloExcepcion {
		if(a+b>c && a+c>b && b+c>a){  //throw new IlegalTrianguloExcepcion();
		this.a = a;
		this.b = b;
		this.c = c;
		}
		else 
			throw new IlegalTrianguloExcepcion();
	}
	
	public static void main(String[] args) {
		try {
			Triangulo t = new Triangulo(1, 1, 0);
			System.out.println("Triangulo Validado");
		} catch (IlegalTrianguloExcepcion e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Con esos valores no se forma un triangulo");
		}

	}

}

class IlegalTrianguloExcepcion extends Exception{
	
}

