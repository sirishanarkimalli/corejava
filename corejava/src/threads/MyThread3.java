package threads;

public class MyThread3 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		Thread t = new Thread(mt);

		t.start();
		}
}
