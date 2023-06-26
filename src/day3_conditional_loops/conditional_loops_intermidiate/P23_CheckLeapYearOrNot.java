package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P23_CheckLeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = in.nextInt();
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not Leap Year");
        in.close();
    }

    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
