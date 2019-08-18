package pe.edu.rena.colecciones;
import java.util.*;
public class MiLinkedList {
	public static void main (String [] args) {
		LinkedList<String> list = new LinkedList<String>();
		//Agregando elementos a la lista
		list.add("Ayuwoki");
		list.add("Shrek");
		list.add("pink guy");
		//Agregando un elemento a la primera posicion
		list.addFirst("Elon Musk");
		//Agregando un elemento a la ultima posicion
		list.addLast("dank pepe");
		//Agregando un elemento a la 3ra posicion
		list.add(2,"filthy frank");
		System.out.println(list);
		//Usando iterator 
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Removiendo la primera posicion
		list.removeFirst();
		//Removiendo la ultima posicion
		list.removeLast();
		//Removiendo la 2da posicion
		list.remove(1);
		System.out.println(list);
	}
}
