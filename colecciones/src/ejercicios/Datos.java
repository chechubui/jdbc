/**
 * Ejercicio 3 Tema 9 
 * @author Jesus
 * @version 1.0
 * */

package ejercicios;

import java.util.Arrays;

public class Datos {
	//atributo
	private double [] array;

	/**
	 * constructor
	 * @param array
	 * @param nif
	 * @param edad
	 */
	//constructor
	public Datos(double[] array) {
		this.array = array;
	}

	
	/**
	 * metodo del valor medio de los datos
	 * @return nos devuelve el valor medio 
	 */
	//metodo del valor medio de los datos
	public double valorMedio(){
		double suma=0;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];
		}
		return  suma/array.length ;
		
	}
	
	/**
	 * metodo de desviacion tipica
	 * @return devuelve la desviacion Tipica
	 * */
	// metodo de desviacion tipica
	
	public double desviacionTipica(){
		int suma=0;
		for (int i = 0; i < array.length; i++) {
			suma+=Math.pow(array[i],2);
		}
		return Math.sqrt((suma/array.length)-Math.abs(Math.pow(valorMedio(), 2)));
		
	}
	
	//metodo de mostrar que se encuentran por debajo de la media
	
	public double datosDebajoMedia(){
		int total=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]<valorMedio())
				total++;
		}
		return total;
	}
	
	//metodo el valor minimo
	public double valorMinimo(){
		Arrays.sort(array);
		return array[0];
	}
	
	//metodo valor maximo
	public double valorMaximo(){
		Arrays.sort(array);
		return array[array.length-1];
	}

	@Override
	public String toString() {
		return "Datos [array=" + Arrays.toString(array) + "]";
	}
	
	
	
	
}
