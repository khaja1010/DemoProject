package Programs;

public class Palindrome {
	public static void main(String[] args) {
	String name="aha";
	String rev="";
	for(int i=0;i<name.length();i++) {
 		rev=name.charAt(i)+rev;
		
	}
	System.out.println(rev);
	if(rev.equals(name)) {
		System.out.println("the given string is palindrome");
	}else {
		System.out.println("the given string is not palindrome");
	}
		
	}

}
