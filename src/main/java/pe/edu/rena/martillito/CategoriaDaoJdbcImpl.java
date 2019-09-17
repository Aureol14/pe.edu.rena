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
			try (PreparedStatement pstmt = cn.prepareStatement("select * from categoria where id = ?")) {
				pstmt.setInt(1, id);
				try (ResultSet rs = pstmt.executeQuery()) {
					if (rs.next()) {
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
		try (Connection cn = DriverManager.getConnection(url, usuario, password)) {
			try (PreparedStatement pstmt = cn.prepareStatement("select id,nombre,descripcion from categoria")) {
				try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						Categoria categoria = new Categoria();
						categoria.setId(rs.getInt("id"));
						categoria.setNombre(rs.getString("nombre"));
						categoria.setDescripcion(rs.getString("descripcion"));

						listaCategorias.add(categoria);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCategorias;
	}

	@Override
	public Categoria crearCategoriategoria(Categoria categoria) {
		// CREATE
		String url = "jdbc:mysql://localhost:3306/martillito";
		String usuario = "root";
		String password = "";
		try (Connection cn = DriverManager.getConnection(url, usuario, password)) {
			try (PreparedStatement pstmt = cn.prepareStatement("insert into categoria values (?,?,?)")) {
				pstmt.setInt(1, categoria.getId());
				pstmt.setString(2, categoria.getNombre());
				pstmt.setString(3, categoria.getDescripcion());
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Categoria eliminarCategoriaPorId(int id) {
		// DELETE
		String url = "jdbc:mysql://localhost:3306/martillito";
		String usuario = "root";
		String password = "";
		try (Connection cn = DriverManager.getConnection(url, usuario, password)) {
			try (PreparedStatement pstmt = cn.prepareStatement("DELETE from categoria where id=?")) {
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Categoria actualizarCategoria(Categoria categoria) {
		// UPDATE
		String url = "jdbc:mysql://localhost:3306/martillito";
		String usuario = "root";
		String password = "";
		try (Connection cn = DriverManager.getConnection(url, usuario, password)) {
			try (PreparedStatement pstmt = cn
					.prepareStatement("UPDATE categoria set id=?, nombre=?, descripcion=? where id=?")) {
				pstmt.setInt(1, categoria.getId());
				pstmt.setString(2, categoria.getNombre());
				pstmt.setString(3, categoria.getDescripcion());
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
