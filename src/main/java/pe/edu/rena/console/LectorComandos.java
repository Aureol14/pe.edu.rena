package pe.edu.rena.console;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Producto {
	final String nombre;
	final int cantidad;

	public Producto(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return nombre + " " + cantidad;
	}
}

public class LectorComandos {
	static Scanner scanner;
	static Producto leerProducto() {
		System.out.print("Ingrese nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese la cantidad: ");
		int cantidad = scanner.nextInt();
		scanner.nextLine();
		return new Producto(nombre,cantidad);
	}
	static boolean continuarLectura() {
		do {
		System.out.print("Desea agregar un nuevo producto? S/N: ");
		String rspta = scanner.nextLine().toUpperCase();
		if("S".equals(rspta)) {
			return true;
		}
		if("N".equals(rspta)) {
			return false;
		}
		System.out.println("No entiendo la respuesta.");
		}while(true);
	}
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
//		String inputUsuario;
		List<Producto> lista = new LinkedList<>();
		while (true) {
//			System.out.print("Ingrese Comando: ");
//			inputUsuario = scanner.nextLine();
//			if (inputUsuario.equals("")) {
//				break;
//			}
//			lista.add(inputUsuario);
			Producto producto = leerProducto();
			lista.add(producto);
			if(!continuarLectura()) {
				break;
			}
		}
		System.out.println(lista);
	}
}
