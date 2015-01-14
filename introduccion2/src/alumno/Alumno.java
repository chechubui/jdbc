package alumno;
/**
 * Clase que representa a un alumno de Dam
 * @author Jesus
 * @version 1.0
 */
public class Alumno {
	private String nombre;
	private String nif;
	private int edad;
	/**
	 * constructor
	 * @param nombre
	 * @param nif
	 * @param edad
	 */
	public Alumno(String nombre, String nif, int edad) {
		this.nombre = nombre;
		this.nif = nif;
		this.edad = edad;
	}
	/**
	 * constructor sin parametros
	 */
	public Alumno() {
	}
	/**
	 * getter para cambiar nombre
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * metodo para cambiar el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * devuelve el NIF
	 * @return NIF como String
	 */
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	/**
	 * metodo que sobreescribe el toSTring 
	 */
	public String toString() {
		return "Alumno: nombre=" + nombre + ", nif=" + nif + ", edad=" + edad;
	}
	/**
	 * metodo que devuelve boolean si es o no es mayor de edad
	 * @return true si es mayor de edad
	 */
	public boolean esMayorEdad(){
		return this.edad>17;
	}
}