package pe.edu.rena.martillito;

import java.util.List;

public interface CategoriaDao {
	Categoria obtenerPorId(int id);
	List<Categoria> obtenerTodos();
	Categoria crearCategoriategoria(Categoria categoria);
	Categoria eliminarCategoriaPorId(int id);
	Categoria actualizarCategoria(Categoria categoria);
}
