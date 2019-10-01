package pe.edu.rena.spring;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.edu.rena.spring.modelo.Mesero;
import pe.edu.rena.spring.modelo.Saludo;

@Configuration
@ComponentScan
//Component es una clase o interfaz
public class ProgramaConSpring {
	public static void main (String [] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProgramaConSpring.class)) {
			Carro carro = ctx.getBean(Carro.class);
			System.out.println(carro);
			Saludo saludo = ctx.getBean(Saludo.class);
			System.out.println(saludo.saludar("Luiggi"));
			Mesero mesero = ctx.getBean(Mesero.class);
			System.out.println(mesero.saludar("Luiggi"));
			System.out.println(mesero.despedir("Luiggi"));
			LectorConsola lc = ctx.getBean(LectorConsola.class);
		}
	}
	@Bean
	public Motor motor() {
		return new Motor("90");
	}
	@Bean
	public Carro carro(Motor motor) {
		return new Carro(motor);
	}
	@Bean
	public Scanner lectorPrincipal() {
		return new Scanner(System.in);
	}
}
