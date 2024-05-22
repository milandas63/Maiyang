package com.exception;

public class Intro {
	public static void main(String[] args) {
		int d = 1024;
		int q = 2;
		String name = "Maiyang";
		String[] vowels = {"A","E","I","O","U","a","e","i","o","u"};
		
		try {
			System.out.println("This is a line of text");
			System.out.println("The 2nd line doesn't have error");
			double r = d/q;
			System.out.println("The result is "+r);
			System.out.println(name.charAt(6));
			System.out.println("Try statement executed successfully");
			System.out.println(vowels[10]);
		} catch(Exception e) {
			System.out.println("There is an exception "+e);
		}
	}
}
