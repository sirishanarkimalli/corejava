package exceptionHandling;

public class ThrowsKeywordDemo {
	
	int acno;
	String name;
	double balance = 500;
	
	public void withdraw(double amount)throws MinAccountBalanceException {
		
			if ((balance - amount) <= 100) {
				throw new MinAccountBalanceException();
			} else {
				balance -= amount;
				System.out.println("Withdrawn amount Rs " + amount);
//				System.out.println("Available balance= " + getBalance());
			}	
	}
	
	public static void main(String args[])throws MinAccountBalanceException {
		ThrowsKeywordDemo td= new ThrowsKeywordDemo();
		try {
		td.withdraw(900);
		} catch (MinAccountBalanceException me) {
			System.out.println(me.getMessage());
		}
		
		
	}

}
