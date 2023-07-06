package Programs;

public class PrimeNumbers1To100Numbers {

	public static void main(String[] args) {
		int num=50;
		for(int i=2;i<num;i++) {
			boolean found=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					found=false;
					break;
				}
			}
			if(found==true) {
				System.out.println(" "+i);
			}
		}

	}

}
