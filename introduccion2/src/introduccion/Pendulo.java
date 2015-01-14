package introduccion;

public class Pendulo {

	//atributos
	private double longitud;

	//constructor
	public Pendulo(double longitud) {
		this.longitud = longitud;
	}
	
	//getter y setters
	
	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public double periodo(){
		return 2*Math.PI*(Math.sqrt(this.longitud/9.81));
	}

	@Override
	public String toString() {
		return "Pendulo [longitud=" + longitud + "]";
	}

	
}


