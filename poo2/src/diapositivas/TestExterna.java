package diapositivas;

public class TestExterna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Externa ex = new Externa(); //creando objeto externa con referencia
		new Externa(); // aqui anónimo , sin refencia
		/*int numero1= Externa.InternaEstatica.devuelveDos();
		System.out.println(numero1);
		System.out.println("============");
		int numero2= Externa.devuelveDos();
		System.out.println(numero2);
		System.out.println("===========");
		//queremos acceder al metodo devuelve tres de la clase Externa
		int numero3= ex.devuelveTres();
		System.out.println(numero3);
		System.out.println("============");
		int numero4 = (new Externa()).devuelveTres();
		System.out.println(numero4);
		System.out.println("===============");
		//vamos a crear un objeto de la clase Interna
		Externa.Interna in = (ex).new Interna();
		int numero5 = in.devuelveOtroTres();
		System.out.println(numero5);
		
		Externa.Interna in2 = (new Externa().new Interna());
		int numero6 = in2.devuelveOtroTres();
		System.out.println(numero6);*/
		
		//int numero7 = ex.metodoDeInstancia();
		//System.out.println(numero7);
		
		new Externa() ; new Externa();
	
	}
}



class Externa{
	
	//constructor
	public Externa(){
		System.out.println("Creada una clase externa");
		
	}
	//metodo estatico o metodo de clas
	public static int devuelveDos(){
		return 2;
	}
	//clase interna estática
	public static class InternaEstatica{
		public static int devuelveDos(){
			return 2;
		}
	}
	
	//metodo de instancia
	public int devuelveTres(){
		return 3;
	}
	//clase interna no estatica de instancia
	public class Interna{
		public Interna(){
			System.out.println("Creada clase interna");
		}
	
		public int devuelveOtroTres(){
			return 3;
		}
	}
	
	
	public int metodoDeInstancia(){
		int x = 2;
		class Local{
			public int devuelveCuatro(){
				return 4;
			}
		}
		Local l=new Local();
		int numero = l.devuelveCuatro()+x;
		return numero;
	}
	
	//vamos a crear un bloque (bloque anonimo)
	{
		System.out.println("Vamos a crear u bloque anonimo");
		class LocalANivelDeBloque{
			public int  devuelveCinco(){
				return 5;
			}
		}
		LocalANivelDeBloque l= new LocalANivelDeBloque();
		System.out.println(l.devuelveCinco());
	}
	
	//bloque estático
	static{
		System.out.println("Esto es un bloque anónimo a nivel de clase");
		class LocalANivelDeBloqueEstatico{
			private int seis=6;
			public int devuelveSeis(){
				return this.seis;
			}
		}
		LocalANivelDeBloqueEstatico l = new LocalANivelDeBloqueEstatico();
		System.out.println(l.devuelveSeis());
	}
	
	
}
