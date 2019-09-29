package pe.edu.rena.martillito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public final class JDBCUtiles {// nadie puede heredar
	private JDBCUtiles() {// nadie puede crear instancias

	}

	public static Connection obtenerConexion() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/martillito";
		String username = "root";
		String password = "";
		return DriverManager.getConnection(url, username, password);
	}

	public static ResultSet ejecutarOperacionLectura(Connection cn, String sql, Object... params) throws SQLException {
		// varArgs, siempre debe ser el ultimo argumento, puede ser cualquier valor o
		// definido
		PreparedStatement pstmt = cn.prepareStatement(sql);
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				pstmt.setObject(i + 1, params[i]);
			}
		}
		return pstmt.executeQuery();
	}

	public static <E> E leerUnResultado(Connection cn, String sql, MapeadorResultSet<E> lectorResultado,
			Object... params) throws SQLException {
		try (ResultSet rs = ejecutarOperacionLectura(cn, sql, params)) {
			if (rs.next()) {
				return lectorResultado.mapear(rs);
			}
		}
		return null;
	}

	public static <E> List<E> leerMuchosResultados(Connection cn, String sql, MapeadorResultSet<E> lectorResultado,
			Object... params) throws SQLException {
		List<E> listaCategorias = new LinkedList<>();
		try (ResultSet rs = ejecutarOperacionLectura(cn, sql, params)) {
			while (rs.next()) {
				E categoria = lectorResultado.mapear(rs);

				listaCategorias.add(categoria);
			}
		}
		return listaCategorias;
	}

	public static <E> E procesarSql(Pedido<E> pedido, E defaultValue) {
		try (Connection cn = JDBCUtiles.obtenerConexion()) {
			return pedido.procesarSql(cn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return defaultValue;
	}

	public static int ejecutarOperacionEscritura(Connection cn, String sql, Object... params) throws SQLException {
		try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
			if (params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
			}
			return pstmt.executeUpdate();
		}
	}

}
