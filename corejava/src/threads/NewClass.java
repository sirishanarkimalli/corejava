package threads;

public class NewClass {
	
	public synchronized void  sharedMethod(String msg) {
		System.out.print("[ "+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.print("] ");
	}

}
