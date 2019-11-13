package threads;

class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(this.getName() + " " + i);
		}

	}
}

public class ThreadCreationDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1, t2, t3;

		t1 = new MyThread("First");
		t2 = new MyThread("Second");
		t3 = new MyThread("Third");

//		t1.setName("First thread");
//		t2.setName("Second Thread");
//		t3.setName("Third Thread");

		t1.start();
		t2.start();
		t3.start();

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(9);

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}