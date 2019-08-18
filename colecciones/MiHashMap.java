package pe.edu.rena.colecciones;

import java.util.HashMap;//almacena llaves y valores

public class MiHashMap {
	public static void main(String[] args) {
		// Objeto llamado capitalCities usando HashMap
		HashMap<String, String> capitalCities = new HashMap<String, String>(); // <key,values>
		// Para agregar valores se usa el metodo put()
		capitalCities.put("Bolivia", "Sucre");
		capitalCities.put("Peru", "Lima");
		capitalCities.put("Argentina", "Buenos Aires");
		System.out.println(capitalCities);
		// Acceder a un valor se usa el metodo get()
		System.out.println(capitalCities.get("Peru"));
		// Quitar un valor en base a su llave usando el metodo remove()
		capitalCities.remove("Bolivia");
		System.out.println(capitalCities);
		// Para remover todo lo contenido se usa el metodo clear()
		capitalCities.clear();
		System.out.println(capitalCities);
		// contar los valores almacenados
		System.out.println(capitalCities.size());
	}
}
