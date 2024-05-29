public class Unisum {
	public static void main(String[] args) {
		String phone = "9778911223";
		int sum = 0;
		char each;
		while(phone.length()>1) {
			sum = 0;
			for(int i=0; i<phone.length(); i++) {
				each = phone.charAt(i);
				sum = sum + Integer.parseInt(String.valueOf(each));
			}
			System.out.println("Unisum of "+phone+" = "+sum);
			phone = String.valueOf(sum);
		}
	}
}
