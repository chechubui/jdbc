package diapositivas;

public class EjemploExcepcionPropia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				EcuacionSegundoGrado e = new EcuacionSegundoGrado(2, 3, 1);
			} catch (NoEcuacionSegundoGradoExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
//vamos a crear nuestra propia excepcion
@SuppressWarnings("serial")
class NoEcuacionSegundoGradoExcepcion extends Exception {
}

//creamos la clase EcuacionSegundoGrado
class EcuacionSegundoGrado{
	//ax^2+bx+c=0 No será ecuacion de segundo grado si a=0
	private int a;
	private int b;
	private int c;
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @throws NoEcuacionSegundoGradoExcepcion 
	 */
	public EcuacionSegundoGrado(int a, int b, int c) throws NoEcuacionSegundoGradoExcepcion {
		if(a==0) throw new NoEcuacionSegundoGradoExcepcion();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//resto de metodos
	
	
	
	
}
