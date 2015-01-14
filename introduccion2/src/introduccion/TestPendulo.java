package introduccion;

public class TestPendulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pendulo p = new Pendulo(18);
		System.out.println(p);
		System.out.println("El periodo es = "+p.periodo()+ " segundos");
		p.setLongitud(20);
		System.out.println(p);
		System.out.printf("El periodo es = %.2f segundos ",p.periodo());
		

	}

}
