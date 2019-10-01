package pe.edu.rena.spring;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class LectorConsola {

	Scanner scanner;

	public LectorConsola(Scanner scanner) {
		this.scanner = scanner;
	}

	
}
