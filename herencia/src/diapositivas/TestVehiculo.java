package diapositivas;

import java.time.LocalDate;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1 = new Coche(7, true, false);
		Coche c2 = new Coche(4, false, true);
		c1.setPropietario("Jesús");
		c2.setPropietario("David");
		Motocicleta m1 = new Motocicleta(125);
		m1.setPropietario("Dani");
		Motocicleta m2 = new Motocicleta(250);
		m2.setPropietario("Diego");
		
		System.out.println(c1+"\n "+c2+"\n "+m1+"\n "+ m2+"\n ");

	}

}

class Vehiculo{
	//atributos de la clase padre
	private int numeroRuedas;
	private LocalDate fechaCompra;
	private String propietario;
	private int numeroPasajeros;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param numeroPasajeros
	 */
	//constructor que inicializa los atributos de la clase padre
	//que la fecha de creacion coincide con la fecha en la que creamos el objeto
	public Vehiculo(int numeroRuedas, int numeroPasajeros) {
		this.numeroRuedas = numeroRuedas;
		this.fechaCompra = LocalDate.now();
		this.numeroPasajeros = numeroPasajeros;
	}
	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return propietario;
	}
	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	/**
	 * @return the numeroRuedas
	 */
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	/**
	 * @return the fechaCompra
	 */
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	/**
	 * @return the numeroPasajeros
	 */
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", fechaCompra="
				+ fechaCompra + ", propietario=" + propietario
				+ ", numeroPasajeros=" + numeroPasajeros + "]";
	}
	
}

class Coche extends Vehiculo{
	//atributos propios de la clase Coche
	private boolean diesel;
	private boolean descapotable;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param numeroPasajeros
	 * @param diesel
	 * @param descapotable
	 */
	public Coche( int numeroPasajeros, boolean diesel, boolean descapotable) {
		super(4, numeroPasajeros);//inicializa los atributos de la clase padre
		//inicializa los atributos de la clase hija coche
		this.diesel = diesel;
		this.descapotable = descapotable;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	//sobreescribimos el toString de la clase Object, pero aprovechamos
	//el toString sobreescrito de la clase coche
	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable +" " + super.toString() + "]";
	}

	
}
//idem  para motocicletag
class Motocicleta extends Vehiculo{
	private int cilindrada;

	/**
	 * @param numeroRuedas
	 * @param numeroPasajeros
	 * @param cilindrada
	 */
	public Motocicleta(int cilindrada) {
		super(2, 2);
		this.cilindrada = cilindrada;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + " "+ super.toString() + "]";
	}
	
	
}
