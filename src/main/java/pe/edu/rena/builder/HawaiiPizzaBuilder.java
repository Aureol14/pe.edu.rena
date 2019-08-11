package pe.edu.rena.builder;

//Concrete Builder
public class HawaiiPizzaBuilder extends PizzaBuilder{
	@Override
	public void buildMasa() {
		pizza.setMasa("cocida");
	}
	@Override
	public void buildSalsa() {
		pizza.setSalsa("dulce");
	}
	@Override
	public void buildRelleno() {
		pizza.setRelleno("chorizo + alcachofas");
	}
}
