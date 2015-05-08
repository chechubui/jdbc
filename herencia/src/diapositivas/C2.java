package diapositivas;

public class C2 {
	public static void main(String[] args) {
		C1 o = new C1();
		int suma= o.x + o.y +o.z ; //NO accesible a o.u
		o.m(); //accesible a ser protected
	}
}
