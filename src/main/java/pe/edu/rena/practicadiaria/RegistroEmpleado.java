package pe.edu.rena.practicadiaria;

import java.util.*;

class Empleado {
	private final String dni;
	private final String name;
	private final int edad;
	private final double sueldo;
	private final char sexo;

	public Empleado(String dni, String name, int edad, double sueldo, char sexo) {
		this.dni = dni;
		this.name = name;
		this.edad = edad;
		this.sueldo = sueldo;
		this.sexo = sexo;
	}

	public String getDni() {
		return this.dni;
	}

	public String getName() {
		return this.name;
	}

	public int getEdad() {
		return this.edad;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public char getSexo() {
		return this.sexo;
	}

	public String toString() {
		return getDni() + " " + getName() + " " + getEdad() + " " + getSueldo() + " " + getSexo() + "\n";

	}
}

public class RegistroEmpleado {
	public static void main(String[] args) {
		ArrayList<Empleado> en = new ArrayList<>();
		en.add(new Empleado("111111111", "Juan", 30, 1500, 'm'));
		en.add(new Empleado("222222222", "Pedro", 35, 3500, 'm'));
		en.add(new Empleado("333333333", "Julio", 34, 4500, 'm'));
		double prom = ((en.get(0).getSueldo() + en.get(1).getSueldo()) + en.get(2).getSueldo()) / 3;
		System.out.println("Listado de Empleados");
		System.out.println("DNI	 NOMBRE	EDAD SUELDO	SEXO");
		System.out.println(en.get(0));
		System.out.println(en.get(1));
		System.out.println(en.get(2));
		System.out.println("El sueldo promedio es: " + prom);

	}
}
