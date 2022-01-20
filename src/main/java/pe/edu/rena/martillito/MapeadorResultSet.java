package pe.edu.rena.martillito;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface MapeadorResultSet<E> {
	E mapear(ResultSet rs) throws SQLException;
}
