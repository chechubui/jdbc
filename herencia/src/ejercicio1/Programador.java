package ejercicio1;

public class Programador extends InformaticosABS {
	public String lenguaje;

	/**
	 * @param empresa
	 * @param lenguaje
	 */
	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}

	/* (non-Javadoc)
	 * @see ejercicio1.InformaticosABS#pagarSueldo(double)
	 */
	@Override
	public double pagarSueldo(double horas) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(horas)+200;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Programador [lenguaje=" + lenguaje + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
