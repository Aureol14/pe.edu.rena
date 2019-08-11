package pe.edu.rena.builder2;

public class Procesador {
	private final double capacidad;
	private final String tipo;
	private final String marca;

	public Procesador(double capacidad, String tipo, String marca) {
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.marca = marca;
	}

	public double getCapacidad() {
		return this.capacidad;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getMarca() {
		return this.marca;
	}

	@Override
	public String toString() {//Representacion en cadena de un objeto
		return "Procesador [capacidad=" + capacidad + ", tipo=" + tipo + ", marca=" + marca + "]";
	}
	
	
}
