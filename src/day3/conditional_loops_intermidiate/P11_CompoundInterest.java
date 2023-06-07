package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P11_CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        int principle = in.nextInt();
        System.out.println("Enter Rate of interest");
        int rate = in.nextInt();
        System.out.println("Enter Number of year");
        int year = in.nextInt();
        double total = Math.pow((1 + rate / 100), year) * principle;
        System.out.println("Total Amount will after " + year + " year is : " + total);
        in.close();
    }
}
