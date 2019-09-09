package pe.edu.rena.martillito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class CategoriaDaoJdbcImpl implements CategoriaDao {

	@Override
	public Categoria obtenerPorId(int id) {
		String url = "jdbc:mysql://localhost:3306/martillito";
		String usuario = "root";
		String password = "";

		try (Connection cn = DriverManager.getConnection(url, usuario, password)) {
			try(PreparedStatement pstmt = cn.prepareStatement("select * from categoria where id = ?")){
				pstmt.setInt(1, id);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						Categoria categoria = new Categoria();
						categoria.setId(rs.getInt("id"));
						categoria.setNombre(rs.getString("nombre"));
						categoria.setDescripcion(rs.getString("descripcion"));
						return categoria;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Categoria> obtenerTodos() {
		String url = "jdbc:mysql://localhost:3306/martillito";
		String usuario = "root";
		String password = "";
		List<Categoria> listaCategorias = new LinkedList<>();
		try(Connection cn = DriverManager.getConnection(url,usuario,password)){
			try(PreparedStatement pstmt = cn.prepareStatement("select id,nombre,descripcion from categoria")){
				try(ResultSet rs = pstmt.executeQuery()){
					while(rs.next()) {
					Categoria categoria = new Categoria();
					categoria.setId(rs.getInt("id"));
					categoria.setNombre(rs.getString("nombre"));
					categoria.setDescripcion(rs.getString("descripcion"));
					
					listaCategorias.add(categoria);
					}
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCategorias;
	}

}
