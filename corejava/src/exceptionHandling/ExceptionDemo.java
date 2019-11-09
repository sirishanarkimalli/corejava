package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers for division: ");
		try {
			int a = s.nextInt();
			int b = s.nextInt();
			int div = a / b;
			System.out.println(div);
			
			String lang = "Java";
			int n = Integer.parseInt(lang);
			
		} catch (ArithmeticException ae) {
			System.out.println("DIvision by Zero Exception has occured");
		}catch(NumberFormatException ne) {
			System.out.println("Cant convert String to int type");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("In Finally block");
		}
	}

}
