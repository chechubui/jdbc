package ejercicios;

public class Problem {
	String s;
	 class Inner {
		void testMethod() {
			s = "Set from Inner";
		}
	}
	 public static void main(String[] args) {
		//creamos el objeto
		Problem p = new Problem();
		//para poder crear un objeto de la clase interna, Nombre de la clase externa y el nombre de la clase interna
		// y luego hacemos otro objeto por p y el new Inner
		Problem.Inner i= p.new Inner();
		//señalamos al objeto interno "i" para que coja el metodo
		i.testMethod();
		System.out.println(p.s);
	}
}