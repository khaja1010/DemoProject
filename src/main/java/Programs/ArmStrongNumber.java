package Programs;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num=1634;
		int rem;
		int sum=0;
		int armstrong;
		armstrong=num;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem*rem*rem*rem;
			num=num/10;
		}
		if(armstrong==sum) {
			System.out.println("the given number " + armstrong + " is a armstrong number");
		}
		else {
			System.out.println("the given numbeer "+ armstrong +" is not a armstrong number");
		}


	}

}
