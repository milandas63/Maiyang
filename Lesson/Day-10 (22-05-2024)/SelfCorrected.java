package com.exception;

public class SelfCorrected {
	public static void main(String[] args) {
		int d = 1024;
		int q = 0;
		String name = "Maiyang";
		int sindex = 10;
		String[] vowels = {"A","E","I","O","U","a","e","i","o","u"};
		int aindex = 10;

		for(int i=0; i<3; i++) {
			try {
				System.out.println("This is a line of text");
				System.out.println("The 2nd line doesn't have error");
				double r = d/q;
				System.out.println("The result is "+r);
				System.out.println(name.charAt(sindex));
				System.out.println("Try statement executed successfully");
				System.out.println(vowels[aindex]);
				System.out.println("No more exception");
				
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
				aindex = 3; i--;
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException: "+e.getMessage());
				sindex = 3; i--;
			} catch(ArithmeticException e) {
				System.out.println("ArithmeticException: "+e.getMessage());
				q = 3; i--;
			} catch(Exception e) {
				System.out.println("Parent exception");
			}
		}
	}
}
