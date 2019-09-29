package pe.edu.rena.practicadiaria;

import java.util.Scanner;

class EmpleadoNuevo {

	private String dni;
	private String nombre;
	private byte edad;
	private double sueldo;
	private char sexo;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", sexo="
				+ sexo + "]";
	}

}

public class Ejercicio1 {
	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Ingresar dni: ");
			String dni = scn.nextLine();
			System.out.print("Ingresar nombre: ");
			String nombre = scn.nextLine();
			System.out.print("Ingresar edad: ");
			byte edad = scn.nextByte();
			System.out.print("Ingresar sueldo: ");
			double sueldo = scn.nextDouble();
			System.out.print("Ingresar el sexo H/M: ");
			char sexo = scn.next().toUpperCase().charAt(0);
			scn.nextLine();
			EmpleadoNuevo empleado = new EmpleadoNuevo();
			empleado.setDni(dni);
			empleado.setNombre(nombre);
			empleado.setEdad(edad);
			empleado.setSueldo(sueldo);
			empleado.setSexo(sexo);
			System.out.println(empleado);
		}

	}
}
