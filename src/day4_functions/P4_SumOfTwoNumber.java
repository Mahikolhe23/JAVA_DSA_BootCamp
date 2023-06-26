package day4_functions;

import java.util.Scanner;

public class P4_SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int n1 = in.nextInt();
        System.out.println("Enter Num 2");
        int n2 = in.nextInt();
        System.out.println("Sum of Given Numbers is : " + sum(n1, n2));
        in.close();
    }

    static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
