package Programs;

public class FactorialNumber {
	public static void main(String[] args) {
		int num=9;
		int fact=1;
		for(int i=2;i<num;i++) {
			fact=fact*i;
		}
		System.out.println("the givne number is a factorial "+fact);
	}

}
