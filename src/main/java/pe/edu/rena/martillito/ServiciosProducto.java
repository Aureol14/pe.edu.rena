package pe.edu.rena.martillito;

import java.math.BigDecimal;
import java.util.Scanner;

public class ServiciosProducto {
	private ServiciosProducto() {
	}

	public static Scanner scn = new Scanner(System.in);

	public static Producto crearProducto() {
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
		System.out.print("Ingrese el precio: ");
		BigDecimal precio = scn.nextBigDecimal();
		scn.nextLine();
		Producto prod = new Producto();
		System.out.print("Ingrese a la categoria existente que pertenece: ");
		int idcat = scn.nextInt();
		scn.nextLine();
		prod.setId(id);
		prod.setNombre(nom);
		prod.setDescripcion(desc);
		prod.setCantidad(cant);
		prod.setPrecio(precio);
		prod.setId_categoria(idcat);
		return prod;
	}

	public static Producto actualizarProducto() {
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
		return prod;
	}

	public static int eliminarProducto() {
		System.out.print("Ingrese el codigo del producto que desea eliminar: ");
		int id = scn.nextInt();
		scn.nextLine();
		return id;
	}

	public static int leerProducto() {
		System.out.print("Ingrese el producto que desea visualizar: ");
		int id = scn.nextInt();
		scn.nextLine();
		return id;
	}
}
