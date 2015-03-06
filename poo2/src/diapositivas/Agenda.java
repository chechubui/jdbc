package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contacto> lista; //encapsulacion del atributo

	/**
	 * @param lista
	 * crea una agenda a partir de otra agenda
	 */
	public Agenda(List<Contacto> lista) {
		this.lista = lista;
	}

	/**
	 * inicializa la agenda vacía
	 */
	public Agenda() {
		this.lista = new ArrayList<Contacto>();
	}
	
	/**
	 * 
	 * @param c contacto que añadimos 
	 */
	public void addContacto(Contacto c){
		
		this.lista.add(c);
	}
	
	/**
	 * 
	 * @param c contacto a conocer
	 * @return true si esta en la lista
	 */
	public boolean existeContacto(Contacto c){
		return this.lista.contains(c);
	}
	
	/**
	 * 
	 * @param c objeto a eliminar
	 */
	public void eliminarContacto(Contacto c){
		if(this.existeContacto(c))
			this.lista.remove(c);
	}
	
	/**
	 * 
	 * @param c objeto a modificar
	 * @param telefono nuevo numero
	 */
	public void actualizarTelefono(Contacto c, int telefono){
		if(this.existeContacto(c))
			//c.setTelefono(telefono);
			for (Contacto contacto : this.lista) {
				if(contacto.equals(c))
					//System.out.println(contacto);
					contacto.setTelefono(telefono);
			}
	}
	
	/**
	 * 
	 * @param c objeto a modificar
	 * @param nombre nuevo nombre
	 */
	public void actualizarNombre(Contacto c, String nombre){
		if(this.existeContacto(c))
			//c.setNombre(nombre);
			//esta mal porque actualiza el objeto c, que no esta en la lista 
			//habria que actulizar el que esta en la lista
			for (Contacto contacto : this.lista) {
				if(contacto.equals(c))
					//System.out.println(contacto);
					contacto.setNombre(nombre);
			}
	}

	/*public int numeroContactos(Contacto c){
		return 
	}*/
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.lista.toString();
	}
	
	
}
