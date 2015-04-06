package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GuardarObjetos {
	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		
		Persona p1 = new Persona("juan", 18);
		lista.add(p1);
		
		Persona p2 = new Persona("jesus",19);
		lista.add(p2);
		
		Persona p3 = new Persona("eva", 20);
		lista.add(p3);
		
		Persona p4 = new Persona("dani", 14);
		lista.add(p4);
		
		Persona p5 = new Persona("javi", 17);
		lista.add(p5);
		
		//vamos a guardar esta lista en un fichero
		//primero creamos un objeto  ObjectOutputStream
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(
						new File("C:/Users/mañana/Desktop/IO/objeto.dat")));){
			out.writeObject(lista);
		}
		catch(Exception e){
				e.printStackTrace();
		}
			
		try(ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(
						new File("C:/Users/mañana/Desktop/IO/objeto.dat")));){
			List<Persona> listaNueva = (List<Persona>)in.readObject();
			System.out.println("-----------------------");
			System.out.println(listaNueva);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		/*catch(ClassNotFoundException e){
			e.printStackTrace();
		}*/
		
	}
		/*		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
}
class Persona implements Serializable {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}

