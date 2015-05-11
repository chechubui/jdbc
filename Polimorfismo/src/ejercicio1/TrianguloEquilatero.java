package ejercicio1;

public class TrianguloEquilatero extends PoligonoRegular {

	public TrianguloEquilatero(String nombre, int nLados, double longitudLado) {
		super(nombre, nLados, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(3)*Math.pow(this.getLongitudLado(), 2)/4;
	}

}
