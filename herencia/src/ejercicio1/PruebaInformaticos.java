
package ejercicio1;

public class PruebaInformaticos {
	public static void main(String[] args) {
		Analista a1 = new Analista("Oracle", "furia");
		a1.setSueldo(200);
		a1.setSueldo(15);
		System.out.println(a1+"el sueldo total es de "+ a1.pagarSueldo(10));
		
		Programador p1 = new Programador("eclipse", "java");
		p1.setSueldo(15);
		System.out.println(p1+"el sueldo total es de "+ p1.pagarSueldo(10));
	}
}
