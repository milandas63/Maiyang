import java.util.*;
import iig.algorithm.StringStretcher;

public class BoxText {

	public static void main(String[] args) {
		String text = "God is an Annonymous Spritual Body";
		StringTokenizer st = new StringTokenizer(text);
		List<String> list = new ArrayList<String>();
		String token;
		int maxLen = 0;
		StringStretcher ss = new StringStretcher();

		while(st.hasMoreTokens()) {
			token = st.nextToken();
			list.add(token);
			if(token.length()>maxLen) {
				maxLen = token.length();
			}
		}

		for(int i=0; i<maxLen+4; i++) System.out.print("*");
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println("* "+ss.padR(list.get(i), maxLen)+" *");
		}
		for(int i=0; i<maxLen+4; i++) System.out.print("*");
		System.out.println();
	}

}
