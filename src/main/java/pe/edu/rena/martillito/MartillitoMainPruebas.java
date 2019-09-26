package pe.edu.rena.martillito;

import java.util.List;
import java.util.Scanner;

public class MartillitoMainPruebas {
	private static Scanner scn;

	public static void main(String[] args) {
		// CategoriaDao
		CategoriaDao ctaDAO = new CategoriaDaoJdbcImpl();
		// Producto
		ProductoDao prdDAO = new ProductoDaoJdbcImpl();
		scn = new Scanner(System.in);
		System.out.println("Bienvenido a martillito");
		System.out.print("Que operacion desea realizar? (categoria = A, producto = B): ");
		String rspta = scn.nextLine().toUpperCase();
		if ("A".equals(rspta)) {
			System.out.print(
					"Que operacion de CRUD desea realizar para Categoria? (C= crear, R=Leer, U=actualizar, D=eliminar,"
							+ " T= visualizar todos: ");
			String op = scn.nextLine().toUpperCase();
			switch (op) {
			case "C":
				Categoria categoria = ServiciosCategoria.crearCategoria();
				ctaDAO.crearCategoria(categoria);
				System.out.println("Categoria Creada");
				break;
			case "R":
				int id = ServiciosCategoria.leerCategoria();
				System.out.println(ctaDAO.obtenerPorId(id));
				break;
			case "U":
				Categoria cat = ServiciosCategoria.actualizarCategoria();
				ctaDAO.actualizarCategoria(cat);
				System.out.println("Categoria actualizada");
				break;
			case "D":
				int idD = ServiciosCategoria.eliminarCategoria();
				ctaDAO.eliminarCategoriaPorId(idD);
				System.out.println("Categoria eliminada");
				break;
			case "T":
				System.out.println("Esta es la lista de categorias: ");
				List<Categoria> todos = ctaDAO.obtenerTodos();
				System.out.println(todos);
				break;
			default:
				System.out.println("No puedo reconocer su respuesta.");
				break;
			}
		} else if ("B".equals(rspta)) {
			System.out.print(
					"Que operacion de CRUD desea realizar para Productos? (C= crear, R=Leer, U=actualizar, D=eliminar,"
							+ " T= visualizar todos: ");
			String op = scn.nextLine().toUpperCase();
			switch (op) {
			case "C":
				Producto prod = ServiciosProducto.crearProducto();
				prdDAO.CrearProducto(prod);
				System.out.println("Producto Creado");
				break;
			case "R":
				int id = ServiciosProducto.leerProducto();
				System.out.println(prdDAO.ObtenerPorId(id));
				scn.nextLine();
				break;
			case "U":
				Producto producto = ServiciosProducto.actualizarProducto();
				prdDAO.ActualizarProducto(producto);
				System.out.println("Categoria actualizada");
				break;
			case "D":
				int idP = ServiciosProducto.eliminarProducto();
				prdDAO.EliminarProductoPorId(idP);
				System.out.println("Categoria eliminada");
				break;
			case "T":
				System.out.println("Esta es la lista de Productos: ");
				List<Producto> todos = prdDAO.ObtenerTodos();
				System.out.println(todos);
				break;
			default:
				System.out.println("No puedo reconocer su respuesta.");
				break;
			}
		} else
			System.out.println("No se pudo reconocer la opcion.");
	}
}
