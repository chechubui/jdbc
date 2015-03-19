package ejercicios;

import java.time.LocalDate;
import java.util.Arrays;

public class CuentaBancaria {
	private String numeroCuenta;
	private int saldo=0;
	private double interes=2.5;
	private LocalDate fechaCreacion=LocalDate.now(); //fecha de cuando es creada la cuenta
	
	private static int numeroDeCuentas=0;
	
	//constructor que cree cuentas por valores por defecto
	public CuentaBancaria() {
	numeroDeCuentas++;
	}

	
	//constructor que cree cuentas dado un dep´osito inicial y un interes bancario
	/**
	 * @param saldo
	 * @param interes
	 */
	public CuentaBancaria(int saldo, double interes) {
		this.saldo = saldo;
		this.interes = interes;
		numeroDeCuentas++;
	}
	
	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}
	/**
	 * @return the interes
	 */
	public double getInteres() {
		return interes;
	}
	/**
	 * @return the fechaCreacion
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param numeroCuenta
	 */
	

	//creamos una clase interna para la creacion del numero de cuenta
	
	private class CreacionCuenta{
		
		public int[] entidad={1,2,3,4};
		public int[] oficina={5,6,7,8};
		public String numeroCuentaAleatorio=crearnumeroCuentaAleatorio();
		
		public String crearnumeroCuentaAleatorio(){
			int aleatorio=0;
			StringBuilder sBuilder= new StringBuilder();
			while (sBuilder.length()<10){
				aleatorio= (int) (Math.random()*10);
				sBuilder.append(aleatorio);
			}
			return sBuilder.toString();
	
		}
	
		
	}
	public static void main(String[] args) {
		CuentaBancaria c1 = new CuentaBancaria();
		System.out.println(c1);
	}
	
}
