package pe.edu.rena.facade;

public class FundsCheck {
	private double cashInAccount = 1000.00;

	public double getCashInAccount() {
		return cashInAccount;
	}

	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}

	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}

	public boolean haveEnoughMoney(double cashToWithdrawal) {
		if (cashToWithdrawal > getCashInAccount()) {
			System.out.println("Error: No cuenta con suficiente saldo");
			System.out.println("Saldo Actual: " + getCashInAccount());
			return false;
		} else
			decreaseCashInAccount(cashToWithdrawal);
		System.out.println("Retiro Completado: Su saldo actual es " + getCashInAccount());
		return true;
	}

	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposito Completado: Su saldo actual es " + getCashInAccount());
	}
}
