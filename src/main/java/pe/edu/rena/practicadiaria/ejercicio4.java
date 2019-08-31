package pe.edu.rena.practicadiaria;

class trabajador {
	private final String dni;
	private final String name;
	private final String apellido;
	private final String posicion;

	public trabajador(String dni, String name, String apellido, String posicion) {
		this.dni = dni;
		this.name = name;
		this.apellido = apellido;
		this.posicion = posicion;
	}

	public String getDni() {
		return this.dni;
	}

	public String getName() {
		return this.name;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public boolean equals(Object o) {
		return false;
	}

}

public class ejercicio4 {
	public static void main(String[] args) {

	}
}
