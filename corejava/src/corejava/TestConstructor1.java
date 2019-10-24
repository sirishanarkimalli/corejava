package corejava;

public class TestConstructor1 {

	String name;
	double balance;
	public double interestRate=0.9;
	
	public double calculateInterest() {
		double interest = balance * interestRate;
		return interest;
	}

	public static void main(String args[]) {

		TestConstructor1 obj1 = new TestConstructor1();
		TestConstructor1 obj2 = new TestConstructor1();
		TestConstructor1 obj3 = new TestConstructor1();

		obj1.name = "Scott";
		obj1.balance = 50000;
		System.out.println(obj1.calculateInterest());

		obj2.name = "James";
		obj2.balance = 40000;
		System.out.println(obj2.calculateInterest());

		obj3.name = "John";
		obj3.balance = 30000;
		System.out.println(obj3.calculateInterest());
	}

}
