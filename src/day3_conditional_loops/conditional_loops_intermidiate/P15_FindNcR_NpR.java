package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P15_FindNcR_NpR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total items");
        int n = in.nextInt();
        System.out.println("Enter the total selective items");
        int r = in.nextInt();
        int C = fact(n) / (fact(r) * fact(n - r));
        int P = fact(n) / fact(n - r);
        System.out.println("Permutation of Number is : " + P + " And Combination is : " + C);
        in.close();
    }

    static int fact(int n) {
        if (n == 1)
            return n;
        return fact(n - 1);
    }
}
