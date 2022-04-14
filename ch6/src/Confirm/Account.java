package Confirm;
/* 0~1000000 입금처리되도록 setBalance()를 구현 */
/* 입금 가능한 최소 금액과 최대 금액을 상수로 선언하여 */
public class Account {
	private int balance;
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance >= this.MIN_BALANCE && balance <= this.MAX_BALANCE) {
			this.balance += balance;
		}
	}
}