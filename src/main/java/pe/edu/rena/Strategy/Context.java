package pe.edu.rena.Strategy;

public class Context {
	private CommissionStrategy commissionStrategy;

    public Context(CommissionStrategy commissionStrategy){
        this.commissionStrategy = commissionStrategy;
    }

    public double executeStrategy(double amount){
        return commissionStrategy.applyCommission(amount);
    }
}
