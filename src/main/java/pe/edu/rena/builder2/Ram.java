package pe.edu.rena.builder2;

public class Ram {
	private final int capacidad;
	private final String nombre;

	public int getCapacidad() {
		return this.capacidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Ram(int capacidad, String nombre) {
		this.capacidad = capacidad;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ram [capacidad=" + capacidad + ", nombre=" + nombre + "]";
	}
	
	
}
