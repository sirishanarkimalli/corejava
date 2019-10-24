package corejava;

public class TestStaticKeyword {
	//instance variable
	double balance=2000;
	//static variable
	public static double interestRate=0.9;
	
	public  void calculateInterest() {
		double interest=balance*interestRate;
	}
	
	public static void main(String args[]) {
		TestStaticKeyword ob= new TestStaticKeyword();
		
		System.out.println(ob.balance);
		System.out.println(interestRate);
		
	}

}
