package equipo;

import java.util.List;

import equipo.Futbol.Jugador;

public class TestFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Futbol f = new Futbol("IES Virgen del Carmen");
		Futbol.Entrenador e = f.contratarEntrenador("Diego Torres", 5);
		System.out.println(e);
		List<Jugador> plantilla = f.confeccionarEquipo();
		System.out.println(plantilla);
		
	}

}
