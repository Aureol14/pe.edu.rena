package pe.edu.rena.martillito;

import java.sql.Connection;
import java.sql.SQLException;

public interface Pedido<E> {
	E procesarSql(Connection cn) throws SQLException;
}
