package pe.edu.rena.martillito;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface MapeadorDeResultSetACategoria {
	Categoria mapear(ResultSet rs) throws SQLException;
}
