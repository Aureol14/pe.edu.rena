package pe.edu.rena.spring;

public class Motor {
	final private String tipoGasolina;

	public Motor(String tipoGasolina) {
		this.tipoGasolina = tipoGasolina;
	}

	public String getTipoGasolina() {
		return this.tipoGasolina;
	}

	@Override
	public String toString() {
		return "Motor [tipoGasolina=" + tipoGasolina + "]";
	}

}
