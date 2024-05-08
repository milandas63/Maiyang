
public class PrimeNo {
	public static void main(String[] args) {
		int start = 1000;
		int end = 1500;
		int count = 0;
		boolean yesNo;
		
		for(int i=start; i<=end; i++) {
			yesNo = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					yesNo = false;
					break;
				}
			}
			if(yesNo) {
				System.out.print(i+" ");
				count++;
				if(count>=10) {
					System.out.println();
					count = 0;
				}
			}
		}

	}
}
