package ejercicio5;

public class TestMath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numerosEnteros = {2,1,3,1,4,5};
		double [] numeroReales = {2.,1,3,25,4.4,7.6,18.9};
		Math3 m= new Math3();
		System.out.println(m.max(numerosEnteros));
		System.out.println(m.min(numerosEnteros));
		System.out.println(m.max(numeroReales));
		System.out.println(m.min(numeroReales));
		System.out.println("-------------------");
		System.out.println(Extremo1.max(numerosEnteros));
		System.out.println(Extremo1.min(numerosEnteros));
		System.out.println(Extremo1.max(numeroReales));
		System.out.println(Extremo1.min(numeroReales));
		
		
	}

}
