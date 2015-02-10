package ejercicios;
//ClaveSegura.java
/**
 * @author Jesús Buitrago
 * 
 * 6/02/2015
 * */
public class ClaveSegura {
	//atributo
	private String clave;

	/**
	 * @param clave inicializada a atributo
	 */
	public ClaveSegura(String clave) {
		this.clave = clave;
	}
	
	/**
	 * 
	 *@return  devuelve true si tiene almenos 8 caracteres 
	 * */
	public  boolean minimoLongitud0cho(){
		return this.clave.length() > 7;
		
	}
	
	/**
	 * 
	 * @return  devuelve true si tiene letra mayuscula
	 * */
	
	public boolean tieneLetraMayuscula(){
		boolean aux=false;
		for (int i = 0; i < this.clave.length(); i++) {
			if(Character.isUpperCase(this.clave.charAt(i))){
				aux=true;
				break;//no merece la pena buscar mas mayuscula
			}
		}
	return aux;
	}
	
	/**
	 * 
	 * @return  devuelve true si tienen letra minuscula
	 */
	//metodo de letra minuscula
	public  boolean tieneLetraMinuscula(){
		boolean aux=false;
		for (int i = 0; i < this.clave.length(); i++) {
			if(Character.isLowerCase(this.clave.charAt(i))){
				aux=true;
				break;//no merece la pena buscar mas 
			}
		}
	return aux;
	}
	/**
	 * 
	 * @return true si tiene digito
	 */
	//metodo de tiene digito
	public boolean tieneDigito(){
		boolean aux=false;
		for (int i = 0; i < this.clave.length(); i++) {
			if(Character.isDigit(this.clave.charAt(i))){
				aux=true;
				break;//no merece la pena buscar mas 
			}
		}
	return aux;
	}
	
	/**
	 * 
	 * @return true si tiene caracter no alfanumerico
	 */
	public  boolean notieneDigitoOLetras(){
		boolean aux=false;
		for (int i = 0; i < this.clave.length(); i++) {
			if(!Character.isLetterOrDigit(this.clave.charAt(i))){
				aux=true;
				break;//no merece la pena buscar mas
			}
		}
	return aux;
	}
	
	
	
	
	
}
