package componenetes;

import java.util.ArrayList;

public class PersonaHijos {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	private PersonaHijos padre;
	private ArrayList<PersonaHijos> hijos;
	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 */
	public PersonaHijos(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		
		this.padre=null;
		this.hijos=new ArrayList<PersonaHijos>();
		
	
	}
	/**
	 * @param padre the padre to set
	 */
	public void setPadre(PersonaHijos padre) {
		this.padre = padre;
	}
	

	public void addHijo(PersonaHijos hijo){
		hijos.add(hijo);
		hijo.setPadre(this);
	}
	
	public PersonaHijos getHijo(int i ){
		return hijos.get(i);
	}
	
	public int numHijos(){
		return hijos.size();
	}
	
	public boolean tieneHijos(){
		return !hijos.isEmpty();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2;
	}
	
	public void pintaArbol(){
		
		if(!this.tieneHijos())
			System.out.println(this.toString());
		else {
			System.out.println(this.toString());
			for (PersonaHijos hijo : hijos) {
				hijo.pintaArbol();
			}
		}
	}
	
	
}
