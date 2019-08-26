package pe.edu.rena.colecciones;

import java.util.*;

class Persona {
	private final String dni;
	private final String nombre;
	private final String ocupacion;

	public Persona(String dni, String nombre, String ocupacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.ocupacion = ocupacion;
	}

	public String getDni() {
		return this.dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getOcupacion() {
		return this.ocupacion;
	}

	@Override
	public boolean equals(Object o) {// equals
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (o instanceof Persona) {// Asegurar el DownCasting
			Persona persona = (Persona) o; // DownCasting
			return this.dni.equals(persona.dni) && this.nombre.equals(persona.nombre)
					&& this.ocupacion.equals(persona.ocupacion);
		}
		return false;
	}

	@Override
	public int hashCode() {// Identificador "unico" del objeto, hashcode y equals van de la mano
		return Objects.hash(dni, nombre, ocupacion);
	}
}

public class HashMap4 {
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona("1234211", "Aldo", "Cocinero"));
		listaPersonas.add(new Persona("2134232", "Luiggi", "Programador"));
		listaPersonas.add(new Persona("1234284", "Renato", "Estudiante"));
		listaPersonas.add(new Persona("1234285", "Raul", "Cocinero"));
		listaPersonas.add(new Persona("1234286", "Maria", "Programador"));
		listaPersonas.add(new Persona("1234287", "fernanda", "Estudiante"));
		System.out.println(listaPersonas.size());
		//Agrupar a las personas de acuerdo a su ocupacion
		Map<String, List<Persona>> mapa = new HashMap<>();
		for(Persona persona : listaPersonas) {// for ( : ) pertenece a...
			//if (persona.getOcupacion().equals("Cocinero")) {
				//obtener la lista almacenada para esa llave
				List<Persona> listaPersonasPorOcupacion = mapa.get(persona.getOcupacion());
				//verificar si la lista existe
				if (listaPersonasPorOcupacion == null) {
					//si no existe, la creamos y la agregagmos al mapa
					listaPersonasPorOcupacion = new ArrayList<>();
					mapa.put(persona.getOcupacion(), listaPersonasPorOcupacion);
				}
				//en este punto la lista ya existe, así que agregamos la persona a esta lista
				listaPersonasPorOcupacion.add(persona);
			//}
		}
		System.out.println(mapa.size());
		System.out.println(mapa.get("Cocinero").size());
		System.out.println(mapa.get("Programador").size());
		System.out.println(mapa.get("Estudiante").size());
		
		
		
		
		
	}
}
