package ejercicio3;

public class TestVideoJuego {
	public static void main(String[] args) {
		Personaje g1 = new Guerrero("Tor","espada");
		//Personaje g1 = new Guerrero("Tor",500,"espada");
		Guerrero g2 = new Guerrero("Zeus", "mazo");
		//Guerrero g2 = new Guerrero("Zeus",1000,"mazo");
		Mago m1 = new Mago("Merlin", "fuego");
		System.out.println(g1); // se va a mostrar como guerrero porque esta en el metodo
		//toString en Personaje y Guerrero
		System.out.println(g2);
		System.out.println(m1);
		g1.alimentarse(100);
		// con g2 accedo sin problemas al metodo combatir
		//porque el metodo combatir es de la clase Guerrero
		// y g2 se define como Guerrero
		System.out.println(g2.combatir(200));
		//g1 es de la clase Personaje, aunque en tiempo de ejecucion se reserva
		//espacio en memoria para un objeto de tipo Guerrero
		//hay que hacer un casting hacua abajo (downcasting)
		System.out.println(((Guerrero)g1).combatir(200));
		System.out.println(m1.encantar());
		System.out.println("Energia del mago: "+m1.getNivelEnergia());
		
	}
}
