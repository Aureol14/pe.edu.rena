package pe.edu.rena.spring.modelo;

import org.springframework.stereotype.Component;

@Component
public class DespedidaImpl implements Despedida{

	@Override
	public String despedirse(String nombre) {
		return "adios "+nombre;
	}
	
}
