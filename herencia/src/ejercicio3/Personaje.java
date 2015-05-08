package ejercicio3;

public class Personaje {
	protected String nombre;
	protected int nivelEnergia;
	/**
	 * @param nombre
	 * @param nivelEnergia
	 */
	public Personaje(String nombre, int nivelEnergia) {
		this.nombre = nombre;
		this.nivelEnergia = nivelEnergia;
	}
	
	public void alimentarse(int alimento){
		this.nivelEnergia+=alimento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the nivelEnergia
	 */
	public int getNivelEnergia() {
		return nivelEnergia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personajes nombre=" + nombre + ", nivelEnergia= " + nivelEnergia;
	}
	
}