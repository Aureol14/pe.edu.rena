package pe.edu.rena.Strategy;
/*Strategy es dividir funcionalidades estrategias. 
 *Esto te permite enfocarte en un problema en particular
 *y resolverlo para luego decidir cual es la solución 
 *que debe utilizarse para un determinado caso.
 */
public interface CommissionStrategy {
	double applyCommission(double amount);
}
