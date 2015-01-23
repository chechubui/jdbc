package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> lista =  new ArrayList<Double>();
		//ponemos el 1.0 ... ya que le pasamos un double y pasa de un d a un double
		// metemos lo valores en la lista
		lista.add(1.0);
		lista.add(3.8);
		lista.add(15.0);
		lista.add(7.0);
		lista.add(2.0);
		//lo paso a array
		lista.toArray();
		
		//nos recorre el array del tamaño de list y le metemos el los valores del arraylist(lista) al 
		// array datos
		double[] datos= new double [lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			datos[i] = lista.get(i);
		}
		Datos d = new Datos(datos);
		
		System.out.println(d);
		System.out.printf("El valor medio de los datos es %.2f%n",d.valorMedio());
		System.out.printf("La Desviacion tipica = %.2f%n",d.desviacionTipica());
		System.out.println("Numero de datos fuera de la media = "+d.datosDebajoMedia());
		System.out.println("El valor minimo de los datos "+d.valorMinimo());
		System.out.println("El valor maximo de los datos "+d.valorMaximo());
		
		
		
		
		
		
		
		
		
	}

}
