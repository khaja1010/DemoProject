package Programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=122;
		int rem;
		int sum=0;
		int palindrome;
		palindrome=num;
		while(num!=0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(palindrome==sum) {
			System.out.println("the given number " + palindrome + " is a palindrome");
		}
		else {
			System.out.println("the given numbeer "+ palindrome +" is not a palindrome");
		}

	}

}
