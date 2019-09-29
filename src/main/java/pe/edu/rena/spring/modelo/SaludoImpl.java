package pe.edu.rena.spring.modelo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SaludoImpl implements Saludo{

	@Override
	public String saludar(String nombre) {
		return "hola "+nombre;
	}

}
