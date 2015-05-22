package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImp implements UsuarioDAO {
	
	//lo primero que hacer es hacer un objeto de conexion
	//obtenemos la conexion como un atributo de la clase
	Connection conexion = Conexion.getConexion();

	@Override
	public List<UsuarioDTO> getUsuarios() {
		List<UsuarioDTO> lista = new ArrayList<UsuarioDTO>();
		UsuarioDTO usuario = null;
		//sentencia sql a ejecutar
		String sql = "select * from usuario";
		try {
			Statement s = conexion.createStatement();
			ResultSet r = s.executeQuery(sql);
			while (r.next()){
				String nombre = r.getString("nombre");
				String dni = r.getString("dni");
				usuario = new UsuarioDTO(nombre, dni);
				lista.add(usuario);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void addUsuario(UsuarioDTO u) {
		// sentencia sql a ejecutar
		String sql = "insert into usuario(nombre,dni) values(?,?)";
		try {
			PreparedStatement s = conexion.prepareStatement(sql);
			s.setString(1, u.getNombre());
			s.setString(2, u.getDni());
			s.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void eliminarUsuario(UsuarioDTO u) {
		String sql = "delete from usuario where dni=?";
		try {
			PreparedStatement s = conexion.prepareStatement(sql);
			s.setString(1, u.getDni());
			s.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void actualizarUsuario(UsuarioDTO u) {
		// TODO Auto-generated method stub
		String sql ="UPDATE  USUARIO set nombre=? where dni =?";
		try {
			PreparedStatement s = conexion.prepareStatement(sql);
			s.setString(1, u.getNombre());
			s.setString(2, u.getDni());
			s.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
