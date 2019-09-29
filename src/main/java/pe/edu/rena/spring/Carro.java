package pe.edu.rena.spring;

public class Carro {
	final private Motor motor;

	public Carro(Motor motor) {
		this.motor = motor;
	}

	public Motor getMotor() {
		return this.motor;
	}

	@Override
	public String toString() {
		return "Carro [motor=" + motor + "]";
	}

}
