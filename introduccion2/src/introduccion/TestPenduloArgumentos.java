package introduccion;

public class TestPenduloArgumentos {

	public static void main(String[] args) {
	
		double  longitud = Double.parseDouble(args[0]);
		Pendulo p = new Pendulo(longitud);
		System.out.println(p);
		System.out.println("El periodo es = "+p.periodo()+ " segundos");
		
	}

}
