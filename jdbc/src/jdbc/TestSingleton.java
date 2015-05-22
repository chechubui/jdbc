package jdbc;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos objetos Singleton
		//Singleton s1 = new Singleton(); no se puede hacer,pues el contructor el privado
		Singleton s1 = Singleton.getOBJETO_UNICO();
		Singleton s2 = Singleton.getOBJETO_UNICO();
		System.out.println(s1.equals(s2));
		
	}

}

class Singleton{
	private static Singleton OBJETO_UNICO = new Singleton();
	//constructo privado
	private Singleton(){}
	/**
	 * @return the oBJETO_UNICO
	 */
	public static Singleton getOBJETO_UNICO() {
		return OBJETO_UNICO;
	}
	
	
	
}
