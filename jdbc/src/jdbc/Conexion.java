package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.sqlite.SQLiteConfig;

public class Conexion {

	private static Connection conexion = null;
	private Conexion(){}
	
	public static Connection getConexion(){
		String nombreBD = "jdbc:sqlite:C:/Users/mañana/Desktop/sqlite/ejercicio";
		SQLiteConfig config = new SQLiteConfig();
		config.enforceForeignKeys(true);
		try {
			Class.forName("org.sqlite.JDBC");
			conexion = DriverManager.getConnection(nombreBD, config.toProperties());
			System.out.println("Conexion realizada a la base de datos");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	public static void desconectar(){
		if (conexion != null){
			try {
				conexion.close();
				System.out.println("Desconectada de la base de datos");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
