package pe.edu.rena.martillito;

import java.util.List;

public class MartillitoMainPruebas {
	public static void main(String[] args) {
		// Categoria
		CategoriaDao ctaDAO = new CategoriaDaoJdbcImpl();

		Categoria cta1 = ctaDAO.obtenerPorId(1);
		System.out.println(cta1);

		//CREAR
//		Categoria categoria = new Categoria();
//		categoria.setId(3);
//		categoria.setNombre("Herramienta electrica");
//		categoria.setDescripcion("De uso interno");
//		ctaDAO.crearCategoriategoria(categoria);
		
		//UPDATE
		
		
		//ELIMINAR
//		ctaDAO.eliminarCategoriaPorId(3);
		
		List<Categoria> todos = ctaDAO.obtenerTodos();
		System.out.println(todos);
		

		// Producto
		ProductoDao prdDAO = new ProductoDaoJdbcImpl();
		Producto prd1 = prdDAO.ObtenerPorId(1);
		System.out.println(prd1);

		List<Producto> productos = prdDAO.ObtenerTodos();
		System.out.println(productos);
	}
}
