package pe.edu.rena.colecciones;

import java.util.ArrayList;// importar clase arrayList
//ArrayList: lista implementada con un array
public class MiArrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto
		cars.add("Volvo");// agregar un elemento a la lista
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		System.out.println(cars.get(1)); // .get = acceder a un elemento en el arraylist
		cars.set(0, "Tesla"); // .set = modifica un elemento referido a su ubicacion
		System.out.println(cars);
		cars.remove(3);// .remove = eliminar un elemento
		System.out.println(cars);
		cars.clear();// .clear = deja sin elementos
		System.out.println(cars);
		System.out.println(cars.size());// contar la cantidad de elementos en la lista

	}
}
/*Otros metodos
	--Añade el elemento al ArrayList en la posición 'n'
nombreArrayList.add(n, "Elemento 2");
--Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
nombreArrayList.contains("Elemento");
	--Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
nombreArrayList.indexOf("Elemento");
	--Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
nombreArrayList.lastIndexOf("Elemento");
--Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
nombreArrayList.isEmpty();  
	--Copiar un ArrayList 
ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
	--Pasa el ArrayList a un Array 
Object[] array = nombreArrayList.toArray(); 
*/
