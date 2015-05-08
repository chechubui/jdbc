package ejercicio1;

public class Analista extends InformaticosABS {
	public String especialidad;

	/**
	 * @param empresa
	 * @param especialidad
	 */
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}

	/* (non-Javadoc)
	 * @see ejercicio1.InformaticosABS#pagarSueldo(double)
	 */
	@Override
	public double pagarSueldo(double horas) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(horas)+100;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Analista [especialidad=" + especialidad + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
