package corejava;

public class ArraySearch {

	public static void main(String[] args) {
		int marks[]= {55,65,50,30};
		boolean flag=false;
		for(int val:marks)
			if(val==65) {
				System.out.println("Match Found");
				flag=true;
				break;
			}
		if(!flag)
			System.out.println("Match Not Found");
		
	}

}
