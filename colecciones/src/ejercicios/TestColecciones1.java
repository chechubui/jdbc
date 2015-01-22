package ejercicios;

import java.util.Arrays;

public class TestColecciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colecciones1 c = new Colecciones1();
		System.out.println(c);
		
		//APARTADO 1
		//asignamos el valor 5 al ultimo elemento
		//con el length te dice la longitud del array que en esta ocasion es 12(empezamos desde el 0 al 11

		c.setPosicionArray(c.getArray().length-1,5);
		System.out.println(c);
		
		//APARTADO 2
		//Asigna el resto de valores con un bucle que el primer elemento sea 3 y los
		//restantes el doble del anterior.
		int valorInicial=3;
		//c.setPosicionArray(0,valorInicial);
		for (int i =0 ; i < c.getArray().length-1; i++) {
			//metodo profesor
			//c.setPosicionArray(i,c.getArray()[i-1]*2);
			c.setPosicionArray(i,valorInicial);
			valorInicial *=2;
		}
		System.out.println(c);
		
		
		//apartado 3
		//Mediante un bucle calcula la suma de todos los elementos del array.
		int suma=0;
		for (int i = 0; i < c.getArray().length; i++) {
			suma+=c.getArray()[i];
			
		}
		System.out.printf("la suma de los valores es %d%n",suma);
		
		//apartado 4
		//Cambia el valor del array y divide por 3 todos los ultimo cinco valores.
		if (c.getArray().length >= 5){
			for (int i = c.getArray().length-5; i < c.getArray().length; i++) {
				c.setPosicionArray(i, c.getArray()[i]/3);
				
			}	
		}
		else System.out.println("No se puede realizar");
		System.out.println(c);
		
		//apartado 5 
		// Calcula ahora el valor mas peque~no almacenado en el array.
		//Aqui lo hacemos con un arrays predefinido que nos pone el numero mas pequeño en la primera
		//posicion, por eso ponemos posiscion [0]
		Arrays.sort(c.getArray());
		System.out.println("El elemento mas pequeño " +c.getArray()[0]);
		
		//metodo casero
		int valorMenor =c.getArray()[0];
		for (int i = 1; i < c.getArray().length; i++) {
			if(c.getArray()[i]< valorMenor)
				valorMenor= c.getArray()[i];
		}
		System.out.println("El elemento mas pequeño " +valorMenor);
		
		
		//apartado 6
	// Muestra todos los valores en tres filas de cuatro columnas, con una separacion de cinco espacios
		for (int i = 0; i < c.getArray().length; i++) {
			System.out.printf("%5d",c.getArray()[i]);
			if((i+1)%4==0)
				System.out.println();
			
		}
	}

}
