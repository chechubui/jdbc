package ejercicio3;

public class Mago extends Personaje{
	//Atributo
	private String poder;

	/**
	 * @param nombre
	 * @param nivelEnergia
	 * @param poder
	 */
	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nombre: "+nombre+", poder del mago: "+poder+", nivelEnergia: "+ nivelEnergia;
	}

	public String encantar(){
		if(nivelEnergia<=2){
			alimentarse(-2);
			return this.poder;
		}
		return "No tengo energia para usar poderes";
	}
	
}