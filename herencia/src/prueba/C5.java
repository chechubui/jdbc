package prueba;

import diapositivas.C1;

public class C5 {
	void comprobar(){
		C1 o = new C1();
		int suma = o.x; // o.y no es accesible
	}
}

class C6 extends C5{
	
}
