package pe.edu.rena.facade;

public class AccountNumberCheck {
	private int accountNumber = 12345678;

	public int getaccountNumberCheck() {
		return accountNumber;
	}

	public boolean accountActive(int acctNumToCheck) {
		if (acctNumToCheck == getaccountNumberCheck()) {
			return true;
		} else
			return false;
	}
}
