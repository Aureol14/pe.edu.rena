package pe.edu.rena.martillito;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class MartillitoMainPruebas {
	public static void main(String[] args) {
		// CategoriaDao
		CategoriaDao ctaDAO = new CategoriaDaoJdbcImpl();
		// Producto
		ProductoDao prdDAO = new ProductoDaoJdbcImpl();

//		Categoria cta1 = ctaDAO.obtenerPorId(1);
//		System.out.println(cta1);

		// CREAR
//		Categoria categoria = new Categoria();
//		categoria.setId(3);
//		categoria.setNombre("Herramienta electrica");
//		categoria.setDescripcion("De uso interno");
//		ctaDAO.crearCategoriategoria(categoria);

		// UPDATE
//		Categoria cat = new Categoria();
//		cat.setId(1);
//		cat.setNombre("Herramienta de jardineria");
//		cat.setDescripcion("Para uso de jardines domesticos");
//		ctaDAO.actualizarCategoria(cat);

		// ELIMINAR
//		ctaDAO.eliminarCategoriaPorId(3);

//		List<Categoria> todos = ctaDAO.obtenerTodos();
//		System.out.println(todos);
//
//		Producto prd1 = prdDAO.ObtenerPorId(1);
//		System.out.println(prd1);
//
//		List<Producto> productos = prdDAO.ObtenerTodos();
//		System.out.println(productos);
		Scanner scn = new Scanner(System.in);
		System.out.println("Bienvenido a martillito");
		System.out.print("Que operacion desea realizar? (categoria = A, producto = B): ");
		String rspta = scn.nextLine().toUpperCase();
		if("A".equals(rspta)) {
			System.out.print("Que operacion de CRUD desea realizar para Categoria? (C= crear, R=Leer, U=actualizar, D=eliminar,"
					+ " T= visualizar todos: ");
			String op = scn.nextLine().toUpperCase();
			if("C".equals(op)) {
				System.out.print("Ingrese el nuevo id de categoria:");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.print("Ingrese el nombre de la categoria: ");
				String nom = scn.nextLine();
				System.out.print("Ingrese la descripcion para la categoria: ");
				String desc = scn.nextLine();
				Categoria categoria = new Categoria();
				categoria.setId(id);
				categoria.setNombre(nom);
				categoria.setDescripcion(desc);
				ctaDAO.crearCategoria(categoria);
				System.out.println("Categoria Creada");
			}
			if("R".equals(op)) {
				System.out.print("Ingrese la categoria que desea visualizar: ");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.println(ctaDAO.obtenerPorId(id));
			}
			if("U".equals(op)) {
				System.out.print("Ingrese el id de la categoria que desea actualizar: ");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.print("Ingrese el nuevo nombre: ");
				String nom = scn.nextLine();
				System.out.print("Ingrese la nueva descripcion: ");
				String desc = scn.nextLine();
				Categoria categoria = new Categoria();
				categoria.setId(id);
				categoria.setNombre(nom);
				categoria.setDescripcion(desc);
				ctaDAO.actualizarCategoria(categoria);
				System.out.println("Categoria actualizada");
			}
			if("D".equals(op)) {
				System.out.print("Ingrese la categoria que desea eliminar: ");
				int id = scn.nextInt();
				scn.nextLine();
				ctaDAO.eliminarCategoriaPorId(id);
				System.out.println("Categoria eliminada");
			}
			if("T".equals(op)) {
				System.out.println("Esta es la lista de categorias: ");
				List<Categoria> todos = ctaDAO.obtenerTodos();
				System.out.println(todos);
			}
			else
				System.out.println("No puedo reconocer su respuesta.");
		}
		if("B".equals(rspta)) {
			System.out.print("Que operacion de CRUD desea realizar para Productos? (C= crear, R=Leer, U=actualizar, D=eliminar,"
					+ " T= visualizar todos");
			String op = scn.nextLine().toUpperCase();
			if("C".equals(op)) {
				System.out.print("Ingrese id del producto:");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.print("Ingrese el nombre del producto: ");
				String nom = scn.nextLine();
				System.out.print("Ingrese la descripcion para el producto: ");
				String desc = scn.nextLine();
				System.out.print("Ingrese la cantidad de productos: ");
				int cant = scn.nextInt();
				scn.nextLine();
				System.out.println("Ingrese el precio: ");
				BigDecimal precio = scn.nextBigDecimal();
				Producto prod = new Producto();
				System.out.println("Ingrese a la categoria existente que pertenece: ");
				int idcat = scn.nextInt();
				scn.nextLine();
				prod.setId(id);
				prod.setNombre(nom);
				prod.setDescripcion(desc);
				prod.setCantidad(cant);
				prod.setPrecio(precio);
				prod.setId_categoria(idcat);
				prdDAO.CrearProducto(prod);
				System.out.println("Producto Creado");
			}
			if("R".equals(op)) {
				System.out.print("Ingrese el producto que desea visualizar: ");
				int id = scn.nextInt();
				System.out.println(prdDAO.ObtenerPorId(id));
			}
			if("U".equals(op)) {
				System.out.print("Ingrese el id del producto que desea actualizar: ");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.print("Ingrese el nuevo nombre: ");
				String nom = scn.nextLine();
				System.out.print("Ingrese la nueva descripcion: ");
				String desc = scn.nextLine();
				System.out.println();
				System.out.print("Ingrese la cantidad de productos: ");
				int cant = scn.nextInt();
				scn.nextLine();
				System.out.println("Ingrese el precio: ");
				BigDecimal precio = scn.nextBigDecimal();
				Producto prod = new Producto();
				System.out.println("Ingrese a la categoria existente que pertenece: ");
				int idcat = scn.nextInt();
				scn.nextLine();
				prod.setId(id);
				prod.setNombre(nom);
				prod.setDescripcion(desc);
				prod.setCantidad(cant);
				prod.setPrecio(precio);
				prod.setId_categoria(idcat);
				prdDAO.ActualizarProducto(prod);
				System.out.println("Categoria actualizada");
			}
			if("D".equals(op)) {
				System.out.print("Ingrese el codigo del producto que desea eliminar: ");
				int id = scn.nextInt();
				scn.nextLine();
				prdDAO.EliminarProductoPorId(id);
				System.out.println("Categoria eliminada");
			}
			if("T".equals(op)) {
				System.out.println("Esta es la lista de categorias: ");
				List<Producto> todos = prdDAO.ObtenerTodos();
				System.out.println(todos);
			}
			else
				System.out.println("No puedo reconocer su respuesta.");
		}
		else
			System.out.println("No se pudo reconocer la opcion.");
	}
}
