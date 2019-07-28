package pe.edu.rena.Singleton;

import java.io.ObjectInputStream.GetField;

public class principal {
	public static void main (String[] args) {
		Persona p = Persona.getInstance();
		p.setNombre("Luiggi");
		System.out.println("1: "+p.getNombre());
		Persona p2 = Persona.getInstance();
		System.out.println("2: "+p2.getNombre());
		p2.setNombre("Renato");
		System.out.println("1 bis: "+p.getNombre());
	}
}
	
