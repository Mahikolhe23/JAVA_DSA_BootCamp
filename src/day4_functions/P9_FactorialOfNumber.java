package day4_functions;

import java.util.Scanner;

public class P9_FactorialOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to calculate factorial");
        int num = in.nextInt();
        System.out.println("Factorial of Number is " + fact(num));
        in.close();
    }

    static int fact(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}
