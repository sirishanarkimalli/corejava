package corejava;

public class TestConstructor {

	String name;
	double balance;
	public double interestRate;

//default constructor
	public TestConstructor() {
		interestRate = 0.9;
	}

//parameterized Constructor
	public TestConstructor(String n, double bal) {
		name = n;
		balance = bal;
		interestRate = 0.9;
	}

	public TestConstructor(String n, double bal, double itrate) {
		name = n;
		balance = bal;
		interestRate = itrate;
	}

	public double calculateInterest() {
		double interest = balance * interestRate;
		return interest;
	}

	public static void main(String args[]) {
		TestConstructor obj1 = new TestConstructor();
		TestConstructor obj2 = new TestConstructor("James", 40000);
		TestConstructor obj3 = new TestConstructor("John", 30000, 0.9);

		System.out.println(obj1.balance);

		System.out.println(obj2.balance);
	}

}
