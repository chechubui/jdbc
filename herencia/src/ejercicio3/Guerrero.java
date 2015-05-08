package ejercicio3;

public class Guerrero extends Personaje {
	//Atributos
	private String arma;

	/**
	 * @param nombre
	 * @param nivelEnergia
	 * @param arma
	 */
	public Guerrero(String nombre, String arma) {
		super(nombre, 500);
		this.arma = arma;
	}
	
	public String combatir(int energiaCombate){
		if (energiaCombate<=getNivelEnergia()) {
			alimentarse(-energiaCombate);
			return this.arma+" - "+nivelEnergia;
		}
		return "No tengo energia para combatir"; 
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nombre del guerrero: "+nombre+", arma: "+arma+", nivel de Energia "+nivelEnergia;
	}
	
}