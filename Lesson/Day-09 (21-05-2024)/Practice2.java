package com.lang.prac;

public class Practice2 {

	public static void main(String[] args) {
		String[] maya = { "Saint", "Michel", "Avang", "Helena", };
		System.out.println("String[] maya length is " + maya.length);
		for (int i = 0; i < maya.length; i++) {
			System.out.println(maya[i] + " length = " + maya[i].length());
			System.out.println(maya[i]);
		}

	}
}