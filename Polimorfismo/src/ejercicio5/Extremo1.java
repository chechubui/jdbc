package ejercicio5;

import java.util.Arrays;

public interface Extremo1 {
	
	static int min(int[]a){
		Arrays.sort(a);
		return a[0];
	}
	static int max(int[]a){
		Arrays.sort(a);
		return a[a.length-1];
	}
	static double min(double[]a){
		Arrays.sort(a);
		return a[0];
	}
	static double max(double[]a){
		Arrays.sort(a);
		return a[a.length-1];
	}
}
