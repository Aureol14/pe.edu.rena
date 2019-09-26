package pe.edu.rena.martillito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class CategoriaDaoJdbcImpl implements CategoriaDao {

	MapeadorResultSet<Categoria> mapeadorCategoria = (rs) -> {
		Categoria categoria = new Categoria();
		categoria.setId(rs.getInt("id"));
		categoria.setNombre(rs.getString("nombre"));
		categoria.setDescripcion(rs.getString("descripcion"));
		return categoria;
	};

	@Override
	public Categoria obtenerPorId(int id) {
		return JDBCUtiles.procesarSql( (cn) -> {
			return JDBCUtiles.leerUnResultado(cn, "select * from categoria where id = ?",
					mapeadorCategoria, id);
		} , null);
		
	}

	@Override
	public List<Categoria> obtenerTodos() {
		try (Connection cn = JDBCUtiles.obtenerConexion()) {
			return JDBCUtiles.leerMuchosResultados(cn, "select id,nombre,descripcion from categoria",
					mapeadorCategoria);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public Categoria crearCategoria(Categoria categoria) {
		// CREATE
		try (Connection cn = JDBCUtiles.obtenerConexion()) {
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
		try (Connection cn = JDBCUtiles.obtenerConexion()) {
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
		try (Connection cn = JDBCUtiles.obtenerConexion()) {
			try (PreparedStatement pstmt = cn
					.prepareStatement("UPDATE categoria set nombre=?, descripcion=? where id=?")) {
				pstmt.setString(1, categoria.getNombre());
				pstmt.setString(2, categoria.getDescripcion());
				pstmt.setInt(3, categoria.getId());
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
