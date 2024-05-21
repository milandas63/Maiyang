package com.lang.prac;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("String[] args length is " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		String[] array = { "Milan", "maiyang", "Rosyne", "Wiwa" };
		System.out.println("String[] array length is " + array.length);
		for (int i = 0; i < array.length; i++) {
		          System.out.println(array[i]+" length="+array[i].length());
		          for (int j=array[i].length()-1;j>=0;j--) {
		        	  System.out.println(array[i].charAt(j));
		         }
		          
	}
		
		String name="Maiyang Ghiselaine";
		System.out.println(name);
		StringBuffer y= new StringBuffer(name);
		y.delete(0,2);
		System.out.print(y);
	
		

}
}