package corejava;

public class StaticAndInitBlocks { 
	//Static block
	static {
		System.out.println("In Static block");
	}
	
	//Init block
	{
		System.out.println("In init block");
	}
	
	//Constructor
	public StaticAndInitBlocks() {
		System.out.println("In Constructor"+this);
	}

	public static void main(String args[]) {
		new StaticAndInitBlocks();
		new StaticAndInitBlocks();
		
	}
}
