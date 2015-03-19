package ejercicios;

public class Ventilador {
	//atribbutos
	private Velocidad rapidez =Velocidad.LENTO;
	private boolean encendido=false;
	private double radio=50.0;
	private String color="blanco";
	/**
	 * @return the rapidez
	 */
	public Velocidad getRapidez() {
		return rapidez;
	}
	/**
	 * @param rapidez the rapidez to set
	 */
	public void setRapidez(Velocidad rapidez) {
		this.rapidez = rapidez;
	}
	/**
	 * @return the encendido
	 */
	public boolean isEncendido() {
		return encendido;
	}
	/**
	 * @param encendido the encendido to set
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ventilador [rapidez=" + rapidez + ", encendido=" + encendido
				+ ", radio=" + radio + ", color=" + color + "]";
	}
	
	
	
	
}
