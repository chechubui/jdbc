package diapositivas;
/**
 * 
 * @author Jesus Buitago
 * @version 1.0
 * */
public class Contacto {
	private String nombre;
	private int telefono;
	/**
	 * @param nombre String que tiene el nombre
	 * @param telefono int que contiene el numero de telefono sin guiones
	 */
	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " {nombre=" + nombre + ", telefono=" + telefono + "}";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + telefono;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (telefono != other.telefono)
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
