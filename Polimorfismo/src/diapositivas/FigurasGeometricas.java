package diapositivas;

public abstract class FigurasGeometricas {
	private String nombre;

	/**
	 * @param nombre
	 */
	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + "]";
	}
	
	public abstract double getArea();
}

class Circulos extends FigurasGeometricas{
	private double radio;

	/**
	 * @param nombre
	 * @param radio
	 */
	public Circulos(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(radio,2)*Math.PI;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", Nombre " + getNombre() + "]";
	}
	
	
}

abstract class Cuadrilateros extends FigurasGeometricas{
	private double lado1;
	private double lado2;
	/**
	 * @param nombre
	 * @param lado1
	 * @param lado2
	 */
	public Cuadrilateros(double lado1, double lado2) {
		super("Cuadrilatero");
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}
	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}
	
	
}
class CuadradoFigura extends Cuadrilateros{

	/**
	 * @param nombre
	 * @param lado1
	 * @param lado2
	 */
	public CuadradoFigura(double lado) {
		super(lado,lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		//return getLado1()*getLado2();
		// tambien se puede hacer de esta manera
		return Math.pow(getLado1(), 2);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuadrado [Lado= " + getLado1() + ",Nombre= "
				+ getNombre() + "]";
	}
	
}

class Rectangulo extends Cuadrilateros{

	/**
	 * @param lado1
	 * @param lado2
	 */
	public Rectangulo(double lado1, double lado2) {
		super(lado1, lado2);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see diapositivas.FigurasGeometricas#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getLado1()*getLado2();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangulo [Lado1= " + getLado1() + ",Lado2 = "
				+ getLado2() + ", Nombre =" + getNombre() + "]";
	}
	
}

