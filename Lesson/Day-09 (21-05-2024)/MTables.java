import iig.algorithm.StringStretcher;

public class MTables {

	public static void main(String[] args) {
		int start = 2;
		int end = 40;
		StringStretcher ss = new StringStretcher();

		for(int i=start; i<=end; i+=6) {
			for(int j=1; j<=10; j++) {
				for(int k=i; k<=(i+5); k++) {
					if(k>end) break;
					System.out.print(ss.padL(k,2)+" x "+ss.padL(j,2)+" = "+ss.padL((k*j),3)+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}
}
