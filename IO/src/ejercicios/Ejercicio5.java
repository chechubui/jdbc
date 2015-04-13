//no esta terminado y esta mal echo en la parte de lista..
package ejercicios;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*File inFile = new File("C:/Users/mañana/Desktop/Ejer_IO/geografia_back.csv");
		//al serfichero de texto uso un Scanner para leer
		List<Localidad> lista = null;
		// creamos el fichero de ssalida
		File outFile= new File("C:/Users/mañana/Desktop/Ejer_IO/localidad.txt")
		try (Scanner in = new Scanner(inFile);
			 ObjectOutputStream(new ObjectOutputStream(new FileOutputStream(outFile)))){
			in.useDelimiter(";");
			String leido="";
			String id=in.next();
			String latitud= in.next();
			String longitud = in.next();
			String elevation = in.next();
			String name = in.next();
			String url = in. next();
			String year =in.next();
			double latitudDouble,longitudDouble;
			int elevationInt;
			Localidad l;
			lista = 
			while(in.hasNext()){
				id=in.next();
				latitud= in.next();
				latitudDouble = Double.parseDouble(latitud);
				longitud = in.next();
				longitudDouble =Double.parseDouble(longitud);
				elevation = in.next();
				elevationInt = Integer.parseInt(elevation);
				name = in.next();
				url = in. next();
				year =in.next();
				l = new Localidad(id, latitudDouble, longitudDouble, elevation, name, url, year);
				lista.add(l);
				
			}
		} catch (FileNotFoundException | NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
class Localidad{
	private String id;
	private double latitude;
	private double longitude;
	private int elevation;
	private String name;
	private String url;
	private int year;
	/**
	 * @param id
	 * @param latitude
	 * @param longitude
	 * @param elevation
	 * @param name
	 * @param url
	 * @param year
	 */
	public Localidad(String id, double latitude, double longitude,
			int elevation, String name, String url, int year) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		this.name = name;
		this.url = url;
		this.year = year;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Localidad [id=" + id + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", elevation=" + elevation
				+ ", name=" + name + ", url=" + url + ", year=" + year + "]";
	}
	
}
