package dec31;
interface Bank{
	void withdraw(int amt)throws InsufficentBalanceException;
	void deposit(int amt)throws LimitExceedsException;
}

public class demo6 {

	
		static void m1()throws Exception{
			System.out.println("hello1");
			System.out.println("hello2");
if(1==1) throw new Exception("stpeter college Exception ");
System.out.println("hello3");
System.out.println("hello4");
System.out.println("hello5");
}
		public static void main(String[] args) {
			m1();
		

	}

}
