package pe.edu.rena.martillito;

import java.util.List;

public interface ProductoDao {
	Producto ObtenerPorId(int id);
	List<Producto> ObtenerTodos();
	Producto CrearProducto(Producto producto);
	Producto ActualizarProducto(Producto producto);
	Producto EliminarProductoPorId(int id);
}
