package ejercicio2;

public abstract class Trabajador {
	private String nombre,apellidos;

	/**
	 * @param nombre
	 * @param apellidos
	 */
	public Trabajador(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	protected String nombreApellidos(){
		return "Trabajador:" +this.apellidos+","+this.nombre;
		
	}
	
	public abstract double sueldoMensual(int diasTrabajados );
	
	
}
