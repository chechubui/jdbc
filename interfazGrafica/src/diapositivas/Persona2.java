package diapositivas;

public class Persona2 {
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	//private Localidad localidad;
	/**
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param localidad
	 */
	public Persona2(String nombre, String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		//this.localidad = localidad;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the localidad
	 */
	/*public Localidad getLocalidad() {
		return localidad;
	}*/
	/**
	 * @param localidad the localidad to set
	 */
	/*public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}*/
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", direccion=" + direccion + ", localidad=" + /*localidad + */"]";
	}
	
	
	
}

