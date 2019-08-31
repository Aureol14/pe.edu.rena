package pe.edu.rena.practicadiaria;

import java.io.ObjectInputStream.GetField;
import java.util.*;

class Productos {
	private final int codigo;
	private final String producto;
	private final double precio;
	private final int cantidad;

	public Productos(int codigo, String producto, double precio, int cantidad) {
		this.codigo = codigo;
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getProducto() {
		return this.producto;
	}

	public double getPrecio() {
		return this.precio;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public String toString() {
		return (getCodigo() + " " + getProducto() + " " + getPrecio() + " " + getCantidad() + "\n");
	}

}

public class RegistroCompras {
	public static void main(String[] args) {
		Productos prod1 = new Productos(1111111, "2kg de limon", 5.10, 2);
		double impo1 = prod1.getPrecio() * prod1.getCantidad();
	}
}
