package ejercicio3;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo coche = new Coche();
		Vehiculo moto = new Moto();
		for (int i = 0; i < 20; i++) {
			int aceleracionCoche = (int) (Math.random()*100);
			int deasaceleracionCoche = (int) (Math.random()*100);
			int aceleracionMoto = (int) (Math.random()*100);
			int deasaceleracionMoto = (int) (Math.random()*100);
			System.out.println("Acelerando coche a "+aceleracionCoche+"\n"+coche.acelerar(aceleracionCoche));
			
			System.out.println("Acelerando moto a "+aceleracionMoto+"\n"+moto.acelerar(aceleracionMoto));
			
			System.out.println("desacelerando coche a "+deasaceleracionCoche+"\n"+coche.frenar(deasaceleracionCoche));
			
			System.out.println("desacelerando Moto a "+deasaceleracionMoto+"\n"+moto.frenar(deasaceleracionMoto));
		}
	}

}
