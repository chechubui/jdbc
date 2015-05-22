package jdbc;

public class UsuarioDTO {
	private String nombre;
	private String dni;
	/**
	 * @param nombre
	 * @param dni
	 */
	public UsuarioDTO(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UsuarioDTO [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
	
}
