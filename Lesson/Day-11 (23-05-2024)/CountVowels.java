
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
	}

}
