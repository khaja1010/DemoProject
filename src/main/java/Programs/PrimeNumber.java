package Programs;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=37;
		boolean found=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				found=true;
				break;
			}
			
		}
		if(!found) {
			System.out.println("the given number is "+ num + " prime number");
		}
		else {
			System.out.println("the given number "+ num + " is not a prime number");
		}
	}

}
