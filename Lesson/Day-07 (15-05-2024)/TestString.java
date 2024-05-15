package com.lang.classes;

public class TestString {

	public static void main(String[] arr) {
		System.out.println("String[] arr length is "+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

		String[] sarray = {"Milan","Dilip","Maiyang","Tapan"};
		System.out.println("String[] sarray length is "+sarray.length);
		for(int i=0; i<sarray.length; i++) {
			System.out.println(sarray[i]+" length="+sarray[i].length());
			for(int j=sarray[i].length()-1; j>=0; j--) {
				System.out.print(sarray[i].charAt(j));
			}
			System.out.println();
		}
		
		Integer t = new Integer(100);
		
		String name = "Mahatma Gandhi";
		System.out.println(name.charAt(13));
		
		StringBuffer x = new StringBuffer(name);
		x.delete(0,1);
		x.insert(0, "K");
		System.out.println(x);
		x.append(" India");
		System.out.println(x);
		x.delete(8, 15);
		System.out.println(x);
		System.out.println(x.reverse());
		
	}

}
