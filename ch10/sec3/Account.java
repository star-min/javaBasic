package sec3;

public class Account {
	private int balance;	
	public Account() { }
	public int getBalance() {		return balance;	}
	public void setBalance(int balance) {		this.balance = balance;	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) throws BalanceUnderflowException, Exception {
		if(balance < money) {
			throw new BalanceUnderflowException("잔고 부족 : "+(money-balance)+"이 모자람");
		}
		balance-=money;
	}
}