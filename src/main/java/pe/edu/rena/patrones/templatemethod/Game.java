package pe.edu.rena.patrones.templatemethod;

/*
 * Standardize the skeleton of an algorithm in a base class "template" method
 * Common implementations of individual steps are defined in the base class
 * Steps requiring peculiar implementations are "placeholders" in base class
 * Derived classes can override placeholder methods
 * Derived classes can override implemented methods
 * Derived classes can override and "call back to" base class methods
 *  */
public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// template method
	public final void play() {

		// initialize the game
		initialize();

		// start game
		startPlay();

		// end game
		endPlay();
	}
}
