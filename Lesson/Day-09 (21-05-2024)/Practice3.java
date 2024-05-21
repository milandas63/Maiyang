package com.lang.prac;

import java.time.Year;

public class Practice3 {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        int count = 0;

        System.out.println("The next 20 leap years are:");
        while (count < 20) {
            if (isLeapYear(currentYear)) {
                System.out.println(currentYear);
                count++;
            }
            currentYear++;
        }
    }

    private static boolean isLeapYear(int year) {
        
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
