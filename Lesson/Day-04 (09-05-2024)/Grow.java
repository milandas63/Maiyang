import iig.algorithm.StringStretcher;
import java.util.Date;

public class Grow {
	public static void main(String[] args) {
		StringStretcher ss = new StringStretcher();
		String myText = "Maiyang";
		System.out.println(ss.padLeft(myText, 50, '.'));
		System.out.println(ss.padCenter(myText, 50, '.'));
		System.out.println(ss.padRight(myText, 50, '.'));

		Date today = new Date();
		System.out.println(today);
	}
}
