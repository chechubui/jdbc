package diapositivas;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hija h = new Hija();
		

	}

}
class Padre{
	public Padre(){
		System.out.println("Creado objeto de la clase padre");
	}
}

class Hija extends Padre{
	public Hija(){
		System.out.println("Creado objeto de la calse hija");
		
	}
}
