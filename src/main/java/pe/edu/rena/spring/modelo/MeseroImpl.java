package pe.edu.rena.spring.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MeseroImpl implements Mesero {

	@Autowired
	@Qualifier("saludoBarrioImpl")
	Saludo saludo;
	@Autowired
	Despedida despedida;

//	@Autowired
//	public MeseroImpl(Saludo saludo, Despedida despedida) {
//		this.saludo = saludo;
//		this.despedida = despedida;
//	}

	@Override
	public String saludar(String nombre) {
		return saludo.saludar(nombre) + "!";
	}

	@Override
	public String despedir(String nombre) {
		return despedida.despedirse(nombre)+ "!";
	}

}
