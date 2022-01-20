package pe.edu.rena.martillito;

import java.sql.Connection;
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
		return JDBCUtiles.procesarSql((cn) -> {
			return JDBCUtiles.leerUnResultado(cn, "select * from categoria where id = ?", mapeadorCategoria, id);
		}, null);

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
		JDBCUtiles.procesarSql((cn) -> {
			return JDBCUtiles.ejecutarOperacionEscritura(cn, "insert into categoria values (?,?,?)", categoria.getId(),
					categoria.getNombre(), categoria.getDescripcion());
		}, null);
		return categoria;
	}

	@Override
	public void eliminarCategoriaPorId(int id) {
		// DELETE
		JDBCUtiles.procesarSql((cn) -> {
			return JDBCUtiles.ejecutarOperacionEscritura(cn, "DELETE from categoria where id=?", id);
		}, null);

	}

	@Override
	public Categoria actualizarCategoria(Categoria categoria) {
		// UPDATE
		JDBCUtiles.procesarSql((cn) -> {
			return JDBCUtiles.ejecutarOperacionEscritura(cn, "UPDATE categoria set nombre=?, descripcion=? where id=?",
					categoria.getNombre(), categoria.getDescripcion(), categoria.getId());
		}, null);
		return categoria;
	}

}
