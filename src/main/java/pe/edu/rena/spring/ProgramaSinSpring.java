package pe.edu.rena.spring;

public class ProgramaSinSpring {
	public static void main(String[] args) {
		Motor motor = new Motor("diesel");
		Carro carro = new Carro(motor);
		System.out.println(carro);
	}
}
