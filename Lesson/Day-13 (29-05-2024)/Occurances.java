//	Count the number of alpha character occurances
public class Occurances {

	public static void main(String[] args) {
		String text = "Maiyang is a student of KIIT";
		int[] count = new int[26];
		for(int i=0; i<count.length; i++) count[i] = 0;

		char c;
		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			if(c>=65 && c<=90) {
				count[c-65]++;
			} else if(c>=97 && c<=122) {
				count[c-97]++;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]>0)
				System.out.println((char)(i+65) + " = " + count[i]);
		}
	}

}
