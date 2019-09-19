package pe.edu.rena.martillito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ProductoDaoJdbcImpl implements ProductoDao {

	@Override
	public Producto ObtenerPorId(int id) {
		String url = "jdbc:mysql://localhost:3306/martillito";
		String username = "root";
		String password = "";
		try (Connection cn = DriverManager.getConnection(url, username, password)) {
			try (PreparedStatement pstmt = cn.prepareStatement("select * from producto where id= ?")) {
				pstmt.setInt(1, id);
				try (ResultSet rs = pstmt.executeQuery()) {
					if (rs.next()) {
						Producto producto = new Producto();
						producto.setId(rs.getInt("id"));
						producto.setNombre(rs.getString("nombre"));
						producto.setDescripcion(rs.getString("descripcion"));
						producto.setCantidad(rs.getInt("cantidad"));
						producto.setPrecio(rs.getBigDecimal("precio"));
						producto.setId_categoria(rs.getInt("id_categoria"));
						return producto;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Producto> ObtenerTodos() {
		String url = "jdbc:mysql://localhost:3306/martillito";
		String username = "root";
		String password = "";
		List<Producto> listaProductos = new LinkedList<>();
		try (Connection cn = DriverManager.getConnection(url, username, password)) {
			try (PreparedStatement pstmt = cn.prepareStatement("Select * from producto")) {
				try (ResultSet rs = pstmt.executeQuery()) {
					while (rs.next()) {
						Producto producto = new Producto();
						producto.setId(rs.getInt("id"));
						producto.setNombre(rs.getString("nombre"));
						producto.setDescripcion(rs.getString("descripcion"));
						producto.setCantidad(rs.getInt("cantidad"));
						producto.setPrecio(rs.getBigDecimal("precio"));
						producto.setId_categoria(rs.getInt("id_categoria"));

						listaProductos.add(producto);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaProductos;
	}

	@Override
	public Producto CrearProducto(Producto producto) {
		String url = "jdbc:mysql://localhost:3306/martillito";
		String username = "root";
		String password = "";
		try (Connection cn = DriverManager.getConnection(url, username, password)) {
			try (PreparedStatement ps = cn.prepareStatement("insert into producto values (?,?,?,?,?,?)")) {
				ps.setInt(1, producto.getId());
				ps.setString(2, producto.getNombre());
				ps.setString(3, producto.getDescripcion());
				ps.setInt(4, producto.getCantidad());
				ps.setBigDecimal(5, producto.getPrecio());
				ps.setInt(6, producto.getId_categoria());
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Producto ActualizarProducto(Producto producto) {
		String url = "jdbc:mysql://localhost:3306/martillito";
		String username = "root";
		String password = "";
		try (Connection cn = DriverManager.getConnection(url, username, password)) {
			try (PreparedStatement ps = cn.prepareStatement("update producto set nombre=?, descripcion=?, cantidad=?,"
					+ " precio=?, id_categoria=? where id=?")) {
				ps.setString(1, producto.getNombre());
				ps.setString(2, producto.getDescripcion());
				ps.setInt(3, producto.getCantidad());
				ps.setBigDecimal(4, producto.getPrecio());
				ps.setInt(5, producto.getId_categoria());
				ps.setInt(6, producto.getId());
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Producto EliminarProductoPorId(int id) {
		String url = "jdbc:mysql://localhost:3306/martillito";
		String username = "root";
		String password = "";
		try(Connection cn = DriverManager.getConnection(url,username,password)){
			try(PreparedStatement ps = cn.prepareStatement("delete from producto where id=?")){
				ps.setInt(1, id);
				ps.executeUpdate();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
