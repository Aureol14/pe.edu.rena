package pe.edu.rena.spring.modelo;

import org.springframework.stereotype.Component;

@Component
public class SaludoBarrioImpl implements Saludo{

	@Override
	public String saludar(String nombre) {
		return "Habla bateria";
	}

}
