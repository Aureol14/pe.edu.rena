package pe.edu.rena.practicadiaria;

class estructura_amigo {
	private final String nombre;
	private final String apellido;
	private final String telefono;
	private final int edad;

	public estructura_amigo(String nombre, String apellido, String telefono, int edad) { // constructor
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.edad = edad;
	}

	// getters
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public int getEdad() {
		return this.edad;
	}

}

public class amigo {
	public static void main(String[] args) {
		estructura_amigo amigo = new estructura_amigo("Juanjo", "Lopez", "592-0483", 30);
		System.out.print(amigo.getNombre()+" ");
		System.out.print(amigo.getApellido());
		System.out.print(" tiene " + amigo.getEdad()+" años ");
		System.out.print("y su telefono es el " + amigo.getTelefono());
	}
}
