package pe.edu.rena.builder;

public class DemoBuilder {
	public static void main(String[] args) {
		Cocina cocina = new Cocina(); //Director
		PizzaBuilder hawai_pizzaBuilder = new HawaiiPizzaBuilder();
		PizzaBuilder picante_Builder = new PicantePizzaBuilder();
		cocina.setPizzaBuilder(hawai_pizzaBuilder);
		cocina.construirPizza();
		Pizza pizza = cocina.getPizza();
	}
}
