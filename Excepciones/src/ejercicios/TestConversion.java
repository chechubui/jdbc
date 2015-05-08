package ejercicios;

public class TestConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Binario b = new Binario("110");
			System.out.println("valor en decimal "+b.getValorDecimal());
			
			Hexadecimal h = new Hexadecimal("012Ac");
			System.out.println("valor en decimal(del numero hexa) "+h.getValorDecimal());
			
		} catch (BinarioMalFormadoExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("No es un numero binario");
		} catch (HexadecimalMalFormadoExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("No es un numero hexadecimal");
		}
	}

}

@SuppressWarnings("serial")
class BinarioMalFormadoExcepcion extends Exception{
}

@SuppressWarnings("serial")
class HexadecimalMalFormadoExcepcion extends Exception{
}

class Binario{
	//unica variable
	private String valor;

	/**
	 * @param valor
	 * @throws BinarioMalFormadoExcepcion 
	 */
	public Binario(String valor) throws BinarioMalFormadoExcepcion {
		if(esBinario(valor))
		this.valor = valor;
		else 
			throw new BinarioMalFormadoExcepcion();
	}
	
	private boolean esBinario(String valor){
		return valor.matches("[01]+"); // + es 1 o muchos
	}
	
	public int getValorDecimal(){
		int suma=0;
		StringBuilder sBuilder = new StringBuilder(this.valor);
		String vuelta = sBuilder.reverse().toString();
		for (int i = 0; i < vuelta.length(); i++) {
			//charAt(i) devuelve un char
			//Character.toString convierte el char anterior a un String
			//Integer.ParseInt convierte el String a int 
			//suma += Integer.parseInt(Character.toString(vuelta.charAt(i))) * Math.pow(2, i);
			//en este caso se puede hacer:
			if(vuelta.charAt(i)=='1')
				suma+=Math.pow(2, i);
		}
		return suma;
	}
}

class Hexadecimal{
	private String valor;

	/**
	 * @param valor
	 * @throws HexadecimalMalFormadoExcepcion 
	 */
	public Hexadecimal(String valor) throws HexadecimalMalFormadoExcepcion {
		if(esHexadecimal(valor)) //creo el objeto
		this.valor = valor;
		else
			throw new HexadecimalMalFormadoExcepcion();
	}
	
	private boolean esHexadecimal(String valor){
		return valor.matches("[0-9a-fA-F]+");
	}
	
	public int getValorDecimal(){
		int suma=0;
		StringBuilder sBuilder = new StringBuilder(this.valor.toLowerCase());
		String vuelta = sBuilder.reverse().toString();
		for (int i = 0; i < vuelta.length(); i++) {
			//obtener cada char de la cadena vuelta (hexadecimal al revés)
			char aux = vuelta.charAt(i);
			switch (aux) {
			case 'a':
				suma+=10*Math.pow(16, i);
				break;
			case 'b':
				suma+=11*Math.pow(16, i);
				break;
			case 'c':
				suma+=12*Math.pow(16, i);
				break;
			case 'd':
				suma+=13*Math.pow(16, i);
				break;
			case 'e':
				suma+=14*Math.pow(16, i);
				break;
			case 'f':
				suma+=15*Math.pow(16, i);
				break;

			default:
				suma+=Integer.parseInt(Character.toString(aux))*Math.pow(16, i);
				break;
			}
		}
		return suma;
		
	}
}