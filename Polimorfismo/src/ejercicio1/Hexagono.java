package ejercicio1;

public class Hexagono extends PoligonoRegular {

	public Hexagono(String nombre, int nLados, double longitudLado) {
		super(nombre, nLados, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.getPerimetro()*Math.sqrt(Math.pow(getLongitudLado(), 2))-(Math.pow((getLongitudLado()/2), 2)))/2;
	}

}
