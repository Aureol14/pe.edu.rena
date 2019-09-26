package pe.edu.rena.practicadiaria;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Productos {
	final private int codigo;
	final private String producto;
	final private double precio;
	final private int cantidad;
	final private double importe;

	public Productos(int codigo, String producto, double precio, int cantidad, double importe) {
		this.codigo = codigo;
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.importe = importe;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getProducto() {
		return producto;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getImporte() {
		return importe;
	}

	@Override
	public String toString() {
		return "Productos [codigo=" + codigo + ", producto=" + producto + ", precio=" + precio + ", cantidad="
				+ cantidad + ", importe=" + importe + "]";
	}

}

public class RegistroCompras {
	static Scanner scn;
	static Productos ingresandoProducto() {
		int cod = 1;
			cod++;
		System.out.print("Ingresar Producto: ");
		String prod = scn.nextLine();
		System.out.print("Ingrese la cantidad: ");
		int cant = scn.nextInt();
		scn.nextLine();
		System.out.print("Ingresar precio: ");
		double prec = scn.nextDouble();
		scn.nextLine();
		double importe = prec * cant;
		return new Productos(cod, prod, prec, cant, importe);
	}

	static boolean continuarCompra() {
		do {
			System.out.print("Desea continuar agregando? S/N: ");
			String rpta = scn.nextLine().toUpperCase();
			if ("S".equals(rpta)) {
				return true;
			}
			if ("N".equals(rpta)) {
				return false;
			}
		} while (true);
	}

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		List<Productos> compra = new LinkedList<>();
		while (true) {
			Productos producto = ingresandoProducto();
			compra.add(producto);
			if (!continuarCompra()) {
				break;
			}
		}
		System.out.println("Listado de productos comprados");
		System.out.println("Codigo   Producto   Precio    Cantidad   Importe");
		System.out.println(compra.get(0));
		System.out.println(compra.get(1));
		System.out.println(compra.get(2));
		System.out.println("Total a pagar es: "+(compra.get(0).getImporte()+compra.get(1).getImporte()+compra.get(2).getImporte()));
	}
}