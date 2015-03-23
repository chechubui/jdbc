package equipo;

import java.util.ArrayList;
import java.util.List;

public class Futbol {
	private String nombreEquipo;
	private static final String[] NOMBRE_JUGADORES = {"portero1","defensa1","defensa2","defensa3","defensa4","mediocentro1","mediocentro2","mediocentro3","mediocentro4","delantero1","delantero2"};
	private enum PUESTOS{
		PORTERO, DEFENSA, MEDIOCENTRO, DELANTERO
	}
	/**
	 * @param nombreEquipo
	 */
	public Futbol(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Futbol [nombreEquipo=" + nombreEquipo + "]";
	}
	public class Entrenador{
		private String nombre;
		private int experiencia;
		/**
		 * @param nombre
		 * @param experiencia
		 */
		public Entrenador(String nombre, int experiencia) {
			this.nombre = nombre;
			this.experiencia = experiencia;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Entrenador [nombre=" + nombre + ", experiencia="
					+ experiencia + "]";
		}
	}
	public class Jugador{
		private String nombre;
		private PUESTOS puesto;
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		/**
		 * @param nombre
		 * @param puesto
		 */
		public Jugador(String nombre, PUESTOS puesto) {
			this.nombre = nombre;
			this.puesto = puesto;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", puesto=" + puesto + "]";
		}
		
	}
	public Entrenador contratarEntrenador(String nombre, int experiencia){
		return new Entrenador(nombre, experiencia);
	}
	public List<Jugador> confeccionarEquipo(){
		List<Jugador> plantilla = new ArrayList<Futbol.Jugador>();
		plantilla.add(new Jugador(NOMBRE_JUGADORES[0], PUESTOS.PORTERO));
		for (int i = 1; i < 5; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i],PUESTOS.DEFENSA));
		}
		for (int i = 5; i < 10; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i],PUESTOS.MEDIOCENTRO));
		}
		for (int i = 10; i < 11; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i],PUESTOS.DELANTERO));
		}
		return plantilla;
	}
}
