package threads;

public class DemoClass implements Runnable{
	
	NewClass c;
	String msg;
	Thread t;
	
	DemoClass(String msg, NewClass nc){
		c=nc;
		this.msg=msg;
		t= new Thread(this);
		t.start();
	}
	
	public void run() {
	
			c.sharedMethod(msg);
		
	}

	public static void main(String[] args) {
		NewClass nc= new NewClass();
		
		DemoClass obj1,obj2;
		obj1= new DemoClass("Hello",nc);
		obj2= new DemoClass("Java",nc);
		
		
		

	}

}
