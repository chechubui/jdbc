package diapositivas;

import java.util.List;


public class Agenda {
	private List<Persona2> listapersona;

	public Agenda(List<Persona2> listapersona) {
		this.listapersona = listapersona;
	}

	/**
	 * @return the listapersona
	 */
	public List<Persona2> getListapersona() {
		return listapersona;
	}

	/**
	 * @param listapersona the listapersona to set
	 */
	public void setListapersona(List<Persona2> listapersona) {
		this.listapersona = listapersona;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agenda [listapersona=" + listapersona + "]";
	}
	
	//metodo para agregar personas
	
	public void addPersona(Persona2 p){
		this.listapersona.add(p);
	}
	
	public void rellenarListaPersona(){
		Persona2 p = new Persona2("luis", "bubu", "juju");
		addPersona(p);
		Persona2 p2 = new Persona2("lee", "buu", "ju");
		addPersona(p2);
		Persona2 p3 = new Persona2("ees", "bu", "juj");
		addPersona(p3);
		
	}
	
	public int getSize(){
		return listapersona.size();
	}
	
	
}
