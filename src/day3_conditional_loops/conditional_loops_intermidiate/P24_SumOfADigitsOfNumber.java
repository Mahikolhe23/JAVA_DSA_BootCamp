package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P24_SumOfADigitsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to Calculate Sum of Digits");
        int num = in.nextInt();
        System.out.println("Sum of Digits :" + sum(num));
        in.close();
    }

    static int sum(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem;
            num /= 10;
        }
        return ans;
    }
}
