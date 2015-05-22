package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class PruebaConexion {
	public static final String DB_URL = "jdbc:sqlite:C:/Users/mañana/Desktop/sqlite/bd";
	public static final String DRIVER = "org.sqlite.JDBC";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion=null;
		try {
			Class.forName(DRIVER);
			//vamos a permitir la integridad referencial en sqlite
			//debemos establecer PRAGMA foreign_keys=ON
			SQLiteConfig config = new SQLiteConfig();
			config.enforceForeignKeys(true);
			conexion = DriverManager.getConnection(DB_URL, config.toProperties());
			System.out.println("Conectando a la BD.....");
			//Thread.sleep(3000); //simulo operaciones con la BD(3segunda en espera)
			//vamos a consultar la tabla libro. que tiene entre otros campos, nombre, autor, id categoria
			//creamos la consulta como String
			String sql= "select * from librosCategorias2";
			//creamos un objeto Statement
			Statement statement = conexion.createStatement();
			//recibimos datos de la consulta en un objeto ResultSet
			ResultSet resultset = statement.executeQuery(sql);
			//recorremos el resultset
			String nombre,autor,categoria;
			//int id_categoria;
			while (resultset.next()) {
				nombre=resultset.getString("nombre");
				autor=resultset.getString("autor");
				//id_categoria = resultset.getInt("id_categoria");
				categoria = resultset.getString(4);
				System.out.printf("%35s, %10s, %3s%n",nombre,autor,categoria);
				
				
			}
			//vamos a cambiar el nombre del usuario id=2
			sql="update usuarios set nombre='Diego' where id=2";
			int filasAfectadas = statement.executeUpdate(sql);
			System.out.println("Nº filas afectadas "+filasAfectadas);
			
			//vamos a borrar el usuario de id = 3;
			sql="delete from usuarios  where id=3";
			filasAfectadas = statement.executeUpdate(sql);
			System.out.println("Nº filas afectadas "+filasAfectadas);
			System.out.println("--------------------------\n");
			//vamos a usar PrepareStatement
			//vamos a consultar los  2 primeros libros
			 sql = "select * from libros  where id=?";
			 PreparedStatement preparedStatement =conexion.prepareStatement(sql);
			 for (int i = 1; i < 3; i++) {
				 preparedStatement.setInt(1,i); //el 1 hace referencia a id=?
				 resultset = preparedStatement.executeQuery();
				 while(resultset.next()){
					 nombre = resultset.getString("nombre");
					 String editorial = resultset.getString("editorial");
					 System.out.printf("%15s %15s %n",editorial,nombre);
				 }
				 
			}
			 
			 
			 //vamos a afrupar sentencias sql usando Batch
			 sql = "insert into usuarios(nombre,apellido)values(?,?) ";
			 preparedStatement= conexion.prepareStatement(sql);
			 preparedStatement.setString(1,"luis felipe");
			 preparedStatement.setString(2, "Arriaga");
			 preparedStatement.addBatch();
			 preparedStatement.setString(1,"luis felipe2");
			 preparedStatement.setString(2, "Arriaga2");
			 preparedStatement.addBatch();
			 
			 //Primero hacemos una cosa y luego hacemos otra
			/* sql = "update usuarios set nombre=? where apellido=?";
			 preparedStatement= conexion.prepareStatement(sql);
			 preparedStatement.setString(1, "luis felipe");
			 preparedStatement.setString(2, "Marca");
			 preparedStatement.addBatch();*/
			 int[] affectedRecords = preparedStatement.executeBatch();
			 System.out.println("Registros afectados"+affectedRecords.length);

			 
			 
			 //vamos a hacer transacciones
			 //primero preparamos la Base de Datos
			 conexion.setAutoCommit(false);
			 String sql1 = "insert into usuarios(nombre,apellido)values('Joaquin','Buitrago')";
			 String sql2 = "insert into usuarios(nombre,apellido)values('Gracia','Cano')";
			 statement.execute(sql1);
			 statement.execute(sql2);
			 conexion.commit();//luego ponemos el rollback abajo en el catch donde le hacemos otro try/catch
			 //con esto hacemos que si insertamos un dato que esta mal salta una excepcion y mos deshace lo que
			 //previamente habias metido
			 
			 
			 
			 
			//cerramos conexion
			conexion.close();
			System.out.println("-----------------\n");
			System.out.println("Desconectado la BD");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}

}
