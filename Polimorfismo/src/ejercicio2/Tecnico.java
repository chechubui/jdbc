package ejercicio2;

public class Tecnico extends Trabajador {
	private final double PAGA_DIARIA=200;
	private boolean titulacion;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param titulacion
	 */
	public Tecnico(String nombre, String apellidos, boolean titulacion) {
		super(nombre, apellidos);
		this.titulacion = titulacion;
	}
	@Override
	public double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}
	
	
}
