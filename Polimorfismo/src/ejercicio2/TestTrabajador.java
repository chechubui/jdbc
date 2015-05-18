package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TestTrabajador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador t1 = new Oficial("Jesus", "Buitre", "Oficial primera");
		Trabajador t2 = new Oficial("JesuLuis", "Garcia", "Oficial segunda");
		Trabajador t3 = new Tecnico("Hola", "adios", true);
		Trabajador t4 = new Tecnico("Elisa", "rodri", false);
		
		//lo añadimos a una lusta de Trabajador
		List<Trabajador> lista = new ArrayList<Trabajador>();
		lista.add(t1);lista.add(t2);lista.add(t3);lista.add(t4);
		//recorremos la lista
		//llamamos al metodo nombreApellidos()
		//tambien calculamos la paga a pagar a todos
		double sueldoTotal=0;
		for (Trabajador trabajador : lista) {
			System.out.println(trabajador.nombreApellidos());
			if(trabajador instanceof Oficial)
				System.out.println("Oficial : "+((Oficial)trabajador).getClase() );
			sueldoTotal+=trabajador.sueldoMensual(10);
		}
		System.out.println("Sueldo total que tenemos que pagar: "+sueldoTotal);
		
	}

}
