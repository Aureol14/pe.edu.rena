package pe.edu.rena.martillito;

import java.util.List;

public interface ProductoDao {
	Producto ObtenerPorId(int id);
	List<Producto> ObtenerTodos();
}
