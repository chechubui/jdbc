package diapositivas;

public class Auxiliar {
	public static boolean requisitos(String s){
		/*boolean aux=false;
		 aux = minimoLongitud0cho(s) &&  tieneLetraMayuscula(s) 
			  &&  tieneLetraMinuscula(s) && tieneDigito(s) && tieneDigitoOLetras(s);*/
		//return aux;
		
		//de esta forma es mas efectivo porque en todo que encuentre un false , ya no sigue
		return minimoLongitud0cho(s) &&  tieneLetraMayuscula(s) 
				  &&  tieneLetraMinuscula(s) && tieneDigito(s) && tieneDigitoOLetras(s);

		
	}
	//metodo para saber si la longitud es mas pequeña de 8
	private static boolean minimoLongitud0cho(String s){
		return s.length() > 7;
		
	}
	private static boolean tieneLetraMayuscula(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))){
				aux=true;
				break;//no merece la pena buscar mas mayuscula
			}
		}
	return aux;
	}
	
	//metodo de letra minuscula
	private static boolean tieneLetraMinuscula(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))){
				aux=true;
				break;//no merece la pena buscar mas 
			}
		}
	return aux;
	}
	
	//metodo de tiene digito
	private static boolean tieneDigito(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))){
				aux=true;
				break;//no merece la pena buscar mas 
			}
		}
	return aux;
	}
	
	
	private static boolean tieneDigitoOLetras(String s){
		boolean aux=false;
		for (int i = 0; i < s.length(); i++) {
			if(!Character.isLetterOrDigit(s.charAt(i))){
				aux=true;
				break;//no merece la pena buscar mas
			}
		}
	return aux;
	}
	
	public static void main(String[] args) {
		System.out.println(requisitos("7as!!!!A"));
		
	}
}
