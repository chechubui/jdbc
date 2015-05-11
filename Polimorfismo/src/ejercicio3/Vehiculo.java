package ejercicio3;

public interface Vehiculo {
	//todo atributo en na interfaz es static y final ,, pero no hace falta indicarlo
	int VELOCIDAD_MAX = 20;
	//cualquier metodo es publico pero no hace falta acerlo
	
	String acelerar(int velocidad);
	String frenar(int velocidad);
	
}
