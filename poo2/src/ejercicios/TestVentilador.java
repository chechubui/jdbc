package ejercicios;

public class TestVentilador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventilador v= new Ventilador();
		System.out.println(v);
		v.setColor("azul");
		v.setEncendido(true);
		v.setRadio(150);
		v.setRapidez(Velocidad.RAPIDO);
		System.out.println(v);
	}

}
