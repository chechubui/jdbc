package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
	//atributo coleccion personas
	private List<Persona> listaPersonas;

	//constructor
	public ListaPersonas() {
		//tipico en colecciones de objetos
		//inicializar la colección a colección vacia
		this.listaPersonas = new ArrayList<Persona>();
	}
	
	
	
	//metodo añadir personas
	public void addPersonas(Persona p ){
		//añado un objeto persona ala atributo que es una coleccion
		listaPersonas.add(p);
	}
	
	// metodo eliminar persona
	public void eliminarPersona(Persona p) {
		// Primero dice "esta esa persona en p", si esta la borra pero si no esta no hace nada
		if (listaPersonas.contains(p))
			listaPersonas.remove(p);
	}
	
	//metodo comprobar que existe persona
	public boolean existePersona(Persona p){
		return listaPersonas.contains(p);
		
	}

	//
	public void modificarNombrePersona(Persona p,String nuevoNombre){
		if (listaPersonas.contains(p))
			p.setNombre(nuevoNombre);
		
	}
	
	@Override
	public String toString() {
		return listaPersonas.toString();
	}
	
	
	
	
	
	
	
	
}
