package dec31;

public class SBIBank implements Bank {
	int balance;

	public SBIBank(int balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(int amt) {
		try {
			if(amt>this.balance) {
				System.out.println("amt"+amt+"trying to withdraw--->");
				throw new InsufficentBalanceException("balance is not enough-->");
			}else {
				System.out.println("successfully withdraw amount"+amt);
				this.balance=this.balance-amt;
			}
		}catch(InsufficentBalanceException e) {
			System.out.println("error occured during withdraw");
			e.printStackTrace();
		}
	}
	public void deposit(int amt) {
		try {
			if(amt>50000) {
				System.out.println("amt"+amt+ "trying to deposit--->");
				throw new LimitExceedsException("more than 50k not possible");
			}
			else {
				System.out.println("successfully deposited amount"+amt);
				this.balance=this.balance+amt;
			}
		}catch(LimitExceedsException e) {
			System.out.println("error occured during deposit--->");
			e.printStackTrace();
		}
	}
}
