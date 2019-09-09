package pe.edu.rena.martillito;

import java.math.BigDecimal;

public class Producto { // alt + shift + S = acceder al encapsulamiento
	private int id;
	private String nombre;
	private String descripcion;
	private int cantidad;
	private BigDecimal precio;
	private int id_categoria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	@Override
	public String toString() {
		return id+" "+nombre+" "+descripcion+" "+cantidad+" "+precio+" "+id_categoria;
	}
}
