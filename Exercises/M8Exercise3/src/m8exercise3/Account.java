package m8exercise3;

public class Account {
	
	private int numAccount;
	private int balanceAccount;
	
	public Account(int numAccount, int balanceAccount) {
		this.numAccount = numAccount;
		this.balanceAccount = balanceAccount;
	}

	public int getNumAccount() {
		return numAccount;
	}


	public int getBalanceAccount() {
		return balanceAccount;
	}

	public int enterBalance(int amount) {
		balanceAccount = balanceAccount + amount;
		return balanceAccount;
	}
	
	public void withdrawBalance(int amount) {
		if (balanceAccount >= amount) {
			balanceAccount = balanceAccount - amount;
			System.out.println("The amount " + amount + " has been withdraw. Remains left: " + balanceAccount);
		} else {
			System.out.println("There is no enough balance in your account");
		}
	}

	@Override
	public String toString() {
		return "Account [numAccount=" + numAccount + ", balanceAccount=" + balanceAccount + "]";
	}
	
	
	
}
