package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P18_FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total investment amount");
        int amount = in.nextInt();
        System.out.println("Enter the CAGR");
        int cagr = in.nextInt();
        System.out.println("Enter the total year");
        int year = in.nextInt();
        double sum = amount * (Math.pow((1 + (cagr / 100)), year));
        System.out.println("Total Sum  " + sum + " After " + year + " Year");
        in.close();
    }
}
