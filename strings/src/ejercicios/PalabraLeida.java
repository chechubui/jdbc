package ejercicios;
/**
 * @author Jesus Buitrago
 * @version 1.0
 * */

public class PalabraLeida {
	//atributos
	private String valor;

	//constructor
	public PalabraLeida(String valor) {
		this.valor = valor;
	}
	
	//metodo para saber el numero de Letras
	public int numeroDeLetras(){
		//este es peor
		/*int contador1=0;
		for (int i = 0; i < valor.length(); i++) {
			//System.out.print(valor.charAt(i)+" ");
			contador1++;
		}
		return contador1;*/
		
		
		return this.valor.length();
	}
	
	
	public  boolean empiezaVocal(){
		return this.valor.toLowerCase().matches("[aeiouáéíóú].*");
		/*return valor.startsWith("a") ||valor.startsWith("e")||valor.startsWith("i")||valor.startsWith("o")
				||valor.startsWith("u");*/
		
	}
	
	public  boolean terminaVocal(){
		return this.valor.toLowerCase().matches(".*[aeiouáéíóú]$");//el dolar dice que es la ultima
		/*return valor.startsWith("a") ||valor.startsWith("e")||valor.startsWith("i")||valor.startsWith("o")
				||valor.startsWith("u");*/
		
	}
	
	public int numeroVocales(){
		int contador=0;
		for (int i = 0; i < valor.length(); i++) {
			if (valor.toLowerCase().charAt(i)==('a') || valor.toLowerCase().charAt(i)==('e') 
					|| valor.toLowerCase().charAt(i)==('i') || valor.toLowerCase().charAt(i)==('o')
					|| valor.toLowerCase().charAt(i)==('u'))
			//valor.matches(".*+[aeiou]+.*");
			contador++;
		}
		return contador;
	}
	public boolean contieneH(){
		return this.valor.toLowerCase().matches(".*[h].*");
	}
	
	public boolean esPalindromo(){
		//1ºmetodo
		/*boolean aux=false;
		String palabra = new StringBuilder(valor).reverse().toString();
		if(palabra.equalsIgnoreCase(valor))
			aux=true;
		return aux;*/
		
		//2ºmetodo
		/*String s1=valor.toLowerCase();//guardamos el valor en otra variable para que salfa en miniscula
		StringBuilder palabra = new StringBuilder(valor);
		String s2= palabra.reverse().toString().toLowerCase();
		return s1.equals(s2);*/
		
		//3ºmetodo
		return new StringBuilder(this.valor).reverse().toString().equalsIgnoreCase(this.valor);
		
		//4ºmetodo
		/*StringBuilder sBuilder = new StringBuilder(this.valor);
		//le damos la vuelta y obtenemos el stringBuilder
		StringBuilder sBuilderAlReves = sBuilder.reverse();
		String reverso= sBuilderAlReves.toString();
		return valor.equalsIgnoreCase(reverso);*/
		
	}
	
	public boolean sonIguales(String s){
		return this.valor.equalsIgnoreCase(s);
	}

}
