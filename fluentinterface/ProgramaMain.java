package pe.edu.rena.fluentinterface;

import java.util.Properties;

public class ProgramaMain {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("correo", "prueba@prueba.com");
		p.setProperty("titulo", "hola");
		p.setProperty("mensaje", "hola que tal");
		System.out.println(p.getProperty("correo"));
		System.out.println(p.getProperty("titulo"));
		System.out.println(p.getProperty("mensaje"));
	}
}
