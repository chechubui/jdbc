package ejercicio1;

public class InformaticosABS {
	private String empresa;
	private double sueldo;
	/**
	 * @param empresa
	 * @param sueldo
	 */
	public InformaticosABS(String empresa) {
		this.empresa = empresa;

	}
	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}
	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(String nueva) {
		this.empresa = nueva;
	}
	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double euros) {
		this.sueldo = euros;
	}
	
	public double pagarSueldo(double horas){

		return horas*getSueldo();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InformaticosABS [empresa=" + empresa + ", sueldo=" + sueldo
				+ "]";
	}

	
	
}
