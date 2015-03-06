package diapositivas;

import java.util.Arrays;

public class TestAgenda {

	public static void main(String[] args) {
	//int [] numeros ={........}; plantilla para crear array
	Contacto[] contactos= {new Contacto("manuel",1111), 
				new Contacto("pilar",2222), new Contacto("Jesus",3333), 
				new Contacto("Dani",1111),new Contacto("manuel",6666)};
	
	//Arrays.asList(contactos) convierte el array Contacto[] en una Lista<Contacto> 
	//Tenemos un constructor de agenda que  f          new Agenda(List<Contacto>lista)
	Agenda agenda = new Agenda(Arrays.asList(contactos));
	
	//otra forma de hacerlo es recorrer el array con un bucle for
	// y añadir cada contacto : lista.addContacto(contactos[i])
	System.out.println("Agenda: "+agenda);
	//agenda.addContacto(new Contacto("pepito",5555));
	//esto genera una excepcion. Cambiamos la estrategia
	
	Agenda agenda1= new Agenda();
	for (int i = 0; i < contactos.length; i++) {
		agenda1.addContacto(contactos[i]);
	}
	agenda1.addContacto(new Contacto("pepito",5555));
	System.out.println(agenda1);
	Contacto c1 = new Contacto("",5555);
	System.out.println("=========");
	agenda1.eliminarContacto(c1);
	System.out.println(agenda1);
	//actualizar un nombre
	 c1= new Contacto(" ",1111);
	 agenda1.actualizarNombre(c1, "gabriel");
	 System.out.println("=====================================");
	 System.out.println(agenda1);
	 c1= new Contacto(" ",2222);
	 agenda1.actualizarTelefono(c1,999999);
	 System.out.println("=====================================");
	 System.out.println(agenda1);
	
	
	}

}
