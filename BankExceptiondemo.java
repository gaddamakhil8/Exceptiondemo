package dec31;

public class BankExceptiondemo {

	public static void main(String[] args) {
SBIBank sbi=new SBIBank(5000);
sbi.withdraw(10000);
sbi.withdraw(7000);
sbi.withdraw(1000);
sbi.deposit(100000);
sbi.deposit(600000);
sbi.deposit(10000);
	}

}
