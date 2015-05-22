package ejercicio2;

public class Usuarios {
	private String nombre;
	private String apellido;
	private String email;
	private String login;
	private String contraseña;
	/**
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param login
	 * @param contraseña
	 */
	public Usuarios(String nombre, String apellido, String email, String login,
			String contraseña) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.login = login;
		this.contraseña = contraseña;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	

	
	
}
