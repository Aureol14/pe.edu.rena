package pe.edu.rena.martillito;

import java.util.Scanner;

public class ServiciosCategoria {
	private ServiciosCategoria() {
	}

	public static Scanner scn = new Scanner(System.in);

	public static Categoria crearCategoria() {
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
		return categoria;
	}

	public static Categoria actualizarCategoria() {
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
		return categoria;
	}

	public static int eliminarCategoria() {
		System.out.print("Ingrese la categoria que desea eliminar: ");
		int id = scn.nextInt();
		scn.nextLine();
		return id;
	}

	public static int leerCategoria() {
		System.out.print("Ingrese la categoria que desea visualizar: ");
		int id = scn.nextInt();
		scn.nextLine();
		return id;
	}
}
