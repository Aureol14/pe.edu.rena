package pe.edu.rena.FactoryMethod;

public class ExampleMain {
	public static void main(String[]args) {
		Dog dog = DogFactory.getDog("small");
		dog.speak();
		dog = DogFactory.getDog("big");
		dog.speak();
		dog = DogFactory.getDog("working");
		dog.speak();
	}
}
