package com.lang.prac;

public class Practice4 {
	public static void main(String[] args) {
		int n = 5; // You can change the size of the butterfly here

		// Upper part of the butterfly
		for (int i = 1; i <= n; i++) {
			// Left part of the pattern
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Spaces in the middle
			for (int j = i * 2; j < n * 2; j++) {
				System.out.print("  ");
			}
			// Right part of the pattern
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Lower part of the butterfly
		//for (int i = n; i >= 1; i--) {
			// Left part of the pattern
			//for (int j = 1; j <= i; j++) {
				//System.out.print(j + " ");
			//}
			// Spaces in the middle
			//for (int j = i * 2; j < n * 2; j++) {
				//System.out.print("  ");
			//}
			// Right part of the pattern
			//for (int j = i; j >= 1; j--) {
				//System.out.print(j + " ");
			//}
			//System.out.println();
		}
	}
//}
