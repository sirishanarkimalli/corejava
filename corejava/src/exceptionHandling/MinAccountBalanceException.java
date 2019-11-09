package exceptionHandling;

public class MinAccountBalanceException extends Exception{
	
	public MinAccountBalanceException() {
		super("Account balance cannot be less than Rs 100");
	}
	
	public MinAccountBalanceException(String msg) {
		super(msg);
	}
		
}
