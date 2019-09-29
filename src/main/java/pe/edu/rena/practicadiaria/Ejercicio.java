package pe.edu.rena.practicadiaria;

import java.util.Scanner;

class Alumno {
	final private String nombre;
	final private double nota1;
	final private double nota2;
	final private double nota3;
	final private double promedio;

	public Alumno(String nombre, double nota1, double nota2, double nota3, double promedio) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public double getPromedio() {
		return promedio;
	}
}

public class Ejercicio {
	private static Scanner scn;
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int i, ca = 0, cd = 0;
		double pmy = 0.0, pmn = 0.0;
		pmn = 99;
		for (i = 0; i < 3; i++) {
			System.out.print("Ingresar ID: ");
			int id = scn.nextInt();
			scn.nextLine();
			System.out.print("Ingresar Nota 1: ");
			double pnota = scn.nextDouble();
			scn.nextLine();
			System.out.print("Ingresar Nota 2: ");
			double snota = scn.nextDouble();
			scn.nextLine();
			System.out.print("Ingresar Nota 3: ");
			double tnota = scn.nextDouble();
			scn.nextLine();
			double prom = 0.0;
			prom = (pnota + snota + tnota) / 3;
			for (int j = 0; j < 3; j++) {
				if (prom >= 10.5) {
					ca++;
				} else {
					cd++;
				}
				if (prom > pmy) {
					pmy = prom;
				}
				if (prom < pmn) {
					pmn = prom;
				}
			}
				System.out.println("Cantidada aprobados: "+ca);
				System.out.println("Cantidada desaprobados: "+cd);
				System.out.println("Promedio mayor: "+pmy);
				System.out.println("Promedio menor: "+pmn);
		}
	}
}
