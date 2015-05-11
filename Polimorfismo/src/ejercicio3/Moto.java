package ejercicio3;

public class Moto implements Vehiculo {
	
	private int velocidad = 0;
	//no creo constructor pues cuando cree un nuevo coche la velocidad es el único atributo se inicializa a cerp
	//para crear un new Coche() trabajamos el constructor por defecto
	
	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		this.velocidad+=velocidad;
		String mensaje ="Moto con velocidad actual de "+this.velocidad;
		if((this.velocidad )> VELOCIDAD_MAX)
			mensaje+= " y has superado la velocidad máxima";
		return mensaje;
	}

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		if((this.velocidad-velocidad) <0)
			this.velocidad=0;
		else
			this.velocidad-=velocidad;
		String mensaje ="Moto con velocidad actual de "+this.velocidad;
		if((this.velocidad )> VELOCIDAD_MAX)
			mensaje+= " sigues superando la velocidad máxima";
		return mensaje;
	}
	
	public int numeroPlazas(){
		return 2;
	}

}
