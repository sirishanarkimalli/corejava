package corejava;

public class TestStrings {

	public static void main(String args[]) {
		String s1= new String("Java Programming");
		System.out.println(s1.charAt(7));
		System.out.println(s1.indexOf('a'));

		System.out.println(s1.lastIndexOf('a'));

		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.endsWith("Programming"));
		System.out.println(s1.concat(" Language"));
		//splits the given string based on the delimiter
		String s2="Ram,Sony,Rahul";
		String strarr[]=s2.split(",");
		for(String name : strarr) {
		System.out.println(name);
		}

		String newstr=String.join("   " ,"Hello!","How","are","you?");
		System.out.println(newstr);

		String s3= " world  is Java ";
		System.out.print(s3.trim());
		System.out.println("check");
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));	
		System.out.println(s1==s2);	
		System.out.println(s1==s3);	
		System.out.println(s1.concat(" Programs"));
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', 7));
		
		
	}
}
