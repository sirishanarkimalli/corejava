package exceptionHandling;

public class Account {
	int acno;
	String name;
	double balance = 500;

	public Account(int acno, String name) {
		this.acno = acno;
		this.name = name;
	}

	public void withdraw(double amount) {
		try {
			if ((balance - amount) <= 100) {
				throw new MinAccountBalanceException();
//				throw new NumberFormatException();
			} else {
				balance -= amount;
				System.out.println("Withdrawn amount Rs " + amount);
				System.out.println("Available balance= " + getBalance());
			}
		} catch (MinAccountBalanceException me) {
			System.out.println(me.getMessage());
		}
//		catch(Exception e) {
//			
//		}

	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited Rs " + amount);
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String args[]) {
		Account a = new Account(0001, "Sachin");
		a.deposit(200);
		double amount = 750;
//		System.out.println("Withdrawing amount= " + amount);
		a.withdraw(300);
	}
}
