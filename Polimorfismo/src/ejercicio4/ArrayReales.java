package ejercicio4;

import java.util.Arrays;

public class ArrayReales implements Estadistica {
	private double [] valores;
	
	
	/**
	 * @param valores
	 */
	//al constructo se le pasa el tamñño del array y lo rellenamos de forma aleatorio
	public ArrayReales(int tamano) {
		//primero indicamos el tamaño del array
		//sino se hace origina un error
		this.valores = new double[tamano];
		for (int i = 0; i < tamano; i++) {
			double valor = Math.random()*100;
			valores[i]=valor;
		}
		//lo ordenaremos de forma acedente para facilira la implementacion de los metodos maximo y minimo
		Arrays.sort(valores);
		
	}

	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		if (this.valores.length>0)
			return this.valores[0];
		else {
			System.out.println("Array vacio");
			return 0;
		}
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		if (this.valores.length>0)
			return this.valores[this.valores.length-1];
		else {
			System.out.println("Array vacio");
			return 0;
		}
	}

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		if (this.valores.length>0){
			double suma=0;
			for (int i = 0; i < valores.length; i++) {
				suma+=this.valores[i];
			}
		return suma;
		}
		else {
			System.out.println("Array vacio");
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArrayReales [valores=" + Arrays.toString(valores) + "]";
	}
	

}
