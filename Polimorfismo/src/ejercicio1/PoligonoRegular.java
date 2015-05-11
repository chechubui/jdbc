package ejercicio1;

public abstract class PoligonoRegular implements Comparable {
	
	//atributos
	private String nombre;
	private int nLados;
	private double longitudLado;
	/**
	 * @param nombre
	 * @param numeroLados
	 * @param longitudLado
	 */
	public PoligonoRegular(String nombre, int nLados, double longitudLado) {
		this.nombre = nombre;
		this.nLados = nLados;
		this.longitudLado = longitudLado;
	}
	
	//obtener el perimetro
	
	public double getPerimetro(){
		return this.longitudLado*this.nLados;
	}
	
	//el metodo getArea() es abstrac lo debe implementar cada clase hija
	public abstract double getArea();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PoligonoRegular [nombre=" + nombre + ", longitudLado="
				+ longitudLado + "]";
	}

	/**
	 * @return the longitudLado
	 */
	public double getLongitudLado() {
		return longitudLado;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(longitudLado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + nLados;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Double.doubleToLongBits(longitudLado) != Double
				.doubleToLongBits(other.longitudLado))
			return false;
		if (nLados != other.nLados)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		PoligonoRegular other = (PoligonoRegular) o;
		return this.nLados-other.nLados;
	}
	
	
	
	
	
	
	
	
	

}
