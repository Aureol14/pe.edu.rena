package pe.edu.rena.martillito;

import java.util.List;

public class main {
	public static void main(String[] args) {
		CategoriaDao ctaDAO = new CategoriaDaoJdbcImpl();
		Categoria cta1 = ctaDAO.obtenerPorId(1);
		System.out.println(cta1);
		
		List<Categoria> todos = ctaDAO.obtenerTodos();
		System.out.println(todos); 
		
		
		ProductoDao prdDAO = new ProductoDaoJdbcImpl();
		Producto prd1 = prdDAO.ObtenerPorId(1);
		System.out.println(prd1);
		
		List<Producto> productos = prdDAO.ObtenerTodos();
		System.out.println(productos);
	}
}
