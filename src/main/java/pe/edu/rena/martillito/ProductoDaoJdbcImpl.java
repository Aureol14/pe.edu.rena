package pe.edu.rena.martillito;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ProductoDaoJdbcImpl implements ProductoDao {
	MapeadorResultSet<Producto> mapeadorProducto = (rs) -> {
		Producto producto = new Producto();
		producto.setId(rs.getInt("id"));
		producto.setNombre(rs.getString("nombre"));
		producto.setDescripcion(rs.getString("descripcion"));
		producto.setCantidad(rs.getInt("cantidad"));
		producto.setPrecio(rs.getBigDecimal("precio"));
		producto.setId_categoria(rs.getInt("id_categoria"));
		return producto;
	};

	@Override
	public Producto ObtenerPorId(int id) {
		return JDBCUtiles.procesarSql((cn) -> {
			return JDBCUtiles.leerUnResultado(cn, "select * from producto where id = ?", mapeadorProducto, id);
		}, null);
	}

	@Override
	public List<Producto> ObtenerTodos() {
		try (Connection cn = JDBCUtiles.obtenerConexion()) {
			return JDBCUtiles.leerMuchosResultados(cn, "Select * from producto", mapeadorProducto);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public Producto CrearProducto(Producto producto) {
		JDBCUtiles.procesarSql((cn) -> {
			return JDBCUtiles.ejecutarOperacionEscritura(cn, "insert into producto values (?,?,?,?,?,?)",
					producto.getId(), producto.getNombre(), producto.getDescripcion(), producto.getCantidad(),
					producto.getPrecio(), producto.getId_categoria());
		}, null);
		return producto;
	}

	@Override
	public Producto ActualizarProducto(Producto producto) {
		JDBCUtiles.procesarSql((cn) -> {
			return JDBCUtiles.ejecutarOperacionEscritura(cn,
					"update producto set nombre=?, descripcion=?, cantidad=?, precio=?, id_categoria=? where id=?",
					producto.getNombre(), producto.getDescripcion(), producto.getCantidad(), producto.getPrecio(),
					producto.getId_categoria(), producto.getId());
		}, null);
		return producto;
	}

	@Override
	public void EliminarProductoPorId(int id) {
		JDBCUtiles.procesarSql((cn) -> {
			return JDBCUtiles.ejecutarOperacionEscritura(cn, "delete from producto where id=?", id);
		}, null);
	}

}
