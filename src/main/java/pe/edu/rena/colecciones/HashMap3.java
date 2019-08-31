package pe.edu.rena.colecciones;

import java.util.HashMap;
import java.util.Objects;

class Datos {
	private final String nombre;
	private final String apellido;
	private final Integer telefono;

	public Datos(String nombre, String apellido, Integer telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getTelefono() {
		return this.telefono;
	}
	@Override
	public boolean equals(Object o) {// equals
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if(o instanceof Datos) {//Asegurar el DownCasting
			Datos datos = (Datos)o; //DownCasting
			return this.nombre.equals(datos.nombre) && this.apellido.equals(datos.apellido) &&
					this.telefono.equals(datos.telefono);
		}
		return false;
	}
	@Override
	public int hashCode() {//Identificador "unico" del objeto, hashcode y equals van de la mano
		return Objects.hash(nombre,apellido,telefono);
	}
}

public class HashMap3 {
	public static void main(String[] args) {
		Datos persona1 = new Datos("Julio","Perez",4442331);
		Datos persona2 = new Datos("Martin","Oyola",3332214);
		Datos persona3 = new Datos("Oscar","Ramirez",4311245);
		Datos persona4 = new Datos("Oscar","Ramirez",4311245);
		HashMap<Datos,Integer> mapa = new HashMap<>();
		mapa.put(persona1, 3);
		mapa.put(persona2, 2);
		mapa.put(persona3, 8);
		mapa.put(persona4, 9);
		System.out.println(mapa.size());
		System.out.println(mapa.get(persona3));
	}
}
