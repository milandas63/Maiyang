
public class Pattern2 {
	public static void main(String[] args) {
		int spaces = 35;
		int stars = 1;
		for(int i=0; i<19; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++)  System.out.print("*");
			System.out.println();
			if(i<9) {
				spaces=spaces-1;
				stars=stars+2;
			} else {
				spaces=spaces+1;
				stars=stars-2;
			}
		}
	}
}
