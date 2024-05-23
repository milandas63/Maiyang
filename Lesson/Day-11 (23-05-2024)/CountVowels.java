
public class CountVowels {

	public static void main(String[] args) {
		String text = "We can convert String to Date in java using parse method of DateFormat";
		String vowel = "AEIOUaeiou";
		int vcount = 0;

		char single;
		char vow;

		for(int i=0; i<text.length(); i++) {
			single = text.charAt(i);
			for(int j=0; j<vowel.length(); j++) {
				vow = vowel.charAt(j);
				if(vow==single) {
					vcount++;
				}
			}
		}
		
		System.out.println("Total Vowels: "+vcount);
		
		for(int i=65; i<=90; i++) 
			System.out.print((char)(i));

		System.out.println();
		for(int i=48; i<=57; i++) 
			System.out.print((char)(i));

		System.out.println();
		for(int i=97; i<=122; i++) 
			System.out.print((char)(i));

		System.out.println();
		text = "Good @people ,are kind";
		char c;
		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			if(c>=97 && c<=122) {
				c = (char)(c-32);
			}
			System.out.print(c);
		}
		System.out.println();
		
	}

}
