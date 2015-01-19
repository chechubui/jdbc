package diapositivas;

public class ArraysBidimensonales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definimos un array de 4x3
		int [][] array ={
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		
		//imprimimos el vector el contenido que tiene
		for (int fila = 0; fila < array.length ; fila++) {
			for (int columna=0;columna<array[fila].length;columna++){
			System.out.print(array[fila][columna]+"\t");
			//System.out.println("en el vector ["+fila+"]["+columna+"] "+array[fila][columna] + " ");
			}
			System.out.println();
			//System.out.println("\n");

		}
		
		//calcular el tamaño del vector
		
		int totalvector = 0;
		double suma = 0;
		
		
		for (int i = 0; i < array.length ; i++) {
			for (int j=0;j<array[i].length;j++){
			++totalvector;
			suma+=array[i][j];
			}
		}
		double media = suma/totalvector;
		System.out.println("El tamaño del vector es = "+totalvector);
		System.out.println("La suma de los valores introducidos es = "+suma);
		System.out.println("La media del los valor introducidos es = "+media+"\n");
		 
		
	// hacer una matriz cambiando los valores del anterior array
		
		int [][] array2 = new int [4][3];
		//contador de filas
		int contadorFilas=0;
		
		for (int  fila = array.length-1;fila>=0 ; fila--) {
			//contador Columnas
			int contadorColumnas=0;
			for (int columna= array[fila].length-1; columna >=0 ;columna--){	
			array2[fila][columna]=array[fila][columna];
			
			//System.out.print(array2[fila][columna]+"\t");
			//System.out.println("en el vector1 ["+fila+"]["+columna+"] "+array[fila][columna] + " ");
			
			System.out.println("en el vector2 ["+contadorFilas+"]["+contadorColumnas+"] "+array2[fila][columna] + " ");
				contadorColumnas++;
			}
			contadorFilas++;
			System.out.println();
			
			//System.out.println("\n");

		}
		
		
	}
}
