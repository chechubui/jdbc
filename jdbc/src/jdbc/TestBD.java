package jdbc;

import java.util.List;

public class TestBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioDAOImp uImp = new UsuarioDAOImp();
		List<UsuarioDTO> lista =uImp.getUsuarios();
		System.out.println(lista);
		
		//inserto el usuario
		//UsuarioDTO u = new UsuarioDTO("Jesus","7737" );
		//uImp.addUsuario(u);
		
		System.out.println("Borrado de usuario");
		//vamos a borrar el usuario mediante el dni
		//UsuarioDTO u1 = new UsuarioDTO("", "7737");
		//uImp.eliminarUsuario(u1);
		
		System.out.println("Actualizacion de usuario");
		
		UsuarioDTO u = new UsuarioDTO("felipa", "7737");
		uImp.actualizarUsuario(u);
		
		System.out.println("------------------");
		Conexion.desconectar();
	}

}
