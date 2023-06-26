package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P26_SumOfNumbersTillEnterZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num;
        int sumOfNegative = 0;
        int sumOfOddNum = 0;
        int sumOfEvenNum = 0;
        do {
            num = in.nextInt();
            if (num < 0) {
                sumOfNegative += num;
            } else if (num % 2 == 0) {
                sumOfEvenNum += num;
            } else {
                sumOfOddNum += num;
            }
        } while (num != 0);
        System.out.println("Sum of All Negative Number : " + sumOfNegative);
        System.out.println("Sum of All Even Number : " + sumOfEvenNum);
        System.out.println("Sum of All Odd Number : " + sumOfOddNum);
        in.close();
    }
}
