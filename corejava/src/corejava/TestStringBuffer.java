package corejava;

public class TestStringBuffer {

	public static void main(String[] args) {
		String s1 = "is";
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.capacity());
		System.out.println(sb.append(" language "));
		sb.deleteCharAt(1);
		sb.insert(0,"Java ");
		sb.delete(4,17 );
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
//		System.out.println(sb.capacity());
	}

}
