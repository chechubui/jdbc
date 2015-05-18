package ejercicio2;

public class Oficial extends Trabajador {
	
	//no hago la constante static,pues no la voy a usar fuera de esta clase.De ahi también su modificador private

	private final double PAGA_DIARIA = 100;
	private String clase;
	
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param clase
	 */
	public Oficial(String nombre, String apellidos, String clase) {
		super(nombre, apellidos);
		this.clase = clase;
	}
	
	/**
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}


	@Override
	public double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}

}
