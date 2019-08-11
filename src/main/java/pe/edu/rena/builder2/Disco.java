package pe.edu.rena.builder2;

public class Disco {
	private final String tipo;
	private final int capacidad;

	public Disco(String tipo, int capacidad) {// Contructor
		this.tipo = tipo;
		this.capacidad = capacidad;
	}

	public String getTipo() {// getter
		return this.tipo;
	}

	public int getCapacidad() {// getter
		return this.capacidad;
	}

	@Override
	public String toString() {
		return "Disco [tipo=" + tipo + ", capacidad=" + capacidad + "]";
	}
	
	
}
