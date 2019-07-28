package pe.edu.rena.Strategy;

public class FullCommission implements CommissionStrategy{
	@Override
	public double applyCommission(double amount) {
        // do complicated formula of commissions.
        return amount * 0.50d;
    }
}
