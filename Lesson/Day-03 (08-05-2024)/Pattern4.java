
public class Pattern4 {

	public static void main(String[] args) {
		int spaces = 30;
		int stars = 1;
		String mai = "*";
		
		for(int i=1; i<=9; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=1; j<=stars; j++) {
				if(j==1 || j==stars) {
					mai = "*";
				} else if(i==9) {
					mai = "*";
				} else {
					mai = " ";
				}
				System.out.print(mai);
			}
			System.out.println();
			spaces--; stars+=2;
		}
	}

}
