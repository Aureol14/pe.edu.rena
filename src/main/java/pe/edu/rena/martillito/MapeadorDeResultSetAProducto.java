package pe.edu.rena.martillito;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface MapeadorDeResultSetAProducto {
	Producto mapear(ResultSet rs) throws SQLException;
}
