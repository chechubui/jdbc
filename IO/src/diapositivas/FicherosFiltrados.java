package diapositivas;

import java.io.File;
import java.io.FilenameFilter;


public class FicherosFiltrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length==0) {
			System.out.println("no hay argumentos");
			System.exit(1); //Manda a la linea un 1 y no continua el programa
		}
		//creamos el objeto
		File directorio = new File(args[0]);
		//si es un directorio hacemos un filtro de archivos
		if (directorio.isDirectory()){
			String[] archivos = directorio.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File directotio, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".java");
				}
			}); //clase interna anonima de FileNameFilter
			//hay que sobreescribir el metodo accept
			
			//imprimimos los valores
			for (int i = 0; i < archivos.length; i++) {
				System.out.println("Nombre del archivo: "+archivos[i]);
			}
			//otra forma
			/*for (String file : archivos) {
			
			}*/
		}
	}

}
