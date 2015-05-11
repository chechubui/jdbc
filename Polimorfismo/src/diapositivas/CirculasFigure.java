package diapositivas;

public abstract class CirculasFigure implements Figure {

	private int semiEjeMenor;
	private int semiEjeMayor;
	

	/**
	 * @param semiEjeMenor
	 * @param semiEjeMayor
	 */
	public CirculasFigure(int semiEjeMenor, int semiEjeMayor) {
		this.semiEjeMenor = semiEjeMenor;
		this.semiEjeMayor = semiEjeMayor;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*NUMERO_PI*Math.sqrt((this.semiEjeMayor*this.semiEjeMenor+this.semiEjeMenor*this.semiEjeMayor)/2);
	}



}
