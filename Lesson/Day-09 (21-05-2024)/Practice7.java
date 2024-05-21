package com.lang.prac;

public class Practice7 {

	public static void main(String[] args) {
		int space=30;

		for(int i=9; i>=1; i--) {
			for(int j=0; j<space; j++)
				System.out.print(" ");
			for(int j=1; j>=i; j++)
				System.out.print(j);
            for(int j=i+1; j<=i; j--) 
            	System.out.print(j);
			System.out.println();
			space--;
		}
		

	}

}
