package diapositivas;

public class TestPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaPersonas lista = new ListaPersonas();
		System.out.println(lista);
		Persona p1= new Persona(15, "juanjo");
		Persona p2= new Persona(25, "jesus");
		Persona p3= new Persona(35, "juan");
		Persona p4= new Persona(45, "luis");
		Persona p5= new Persona(55, "pedro");
		lista.addPersonas(p1);
		lista.addPersonas(p2);
		lista.addPersonas(p3);
		lista.addPersonas(p4);
		lista.addPersonas(p5);
		
		System.out.println("Despues de meter datos");
		System.out.println(lista);
		System.out.println("Existe el objeto p1 = "+lista.existePersona(p1));
		lista.addPersonas(new Persona(52,"Rodigro"));
		System.out.println(lista);
		lista.eliminarPersona(p5);
		System.out.println(lista);
		Persona p6 = new Persona(21,"rosalia");
		System.out.println("Existe el objeto p6 = "+lista.existePersona(p6));//no existe porque no lo has metido mediante un lista.add
		
		System.out.println("Existe Rodrigo = "+lista.existePersona(new Persona(52,"Rodigro")));
		
		Persona p7 = new Persona (52,"Rodigro");
		System.out.println("Existe el objeto p7 = "+lista.existePersona(p7));
		
		//modificar el nombre
		
		lista.modificarNombrePersona(p4, "Gregorio");
		System.out.println(lista);
		
	}

}
