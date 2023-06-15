package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class J14_ArmstrongNumberInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = in.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Number is Palindrome");
        } else
            System.out.println("Number is Not Palindrome");
        in.close();
    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int n = 0;
        while (temp > 0) {
            n++;
            temp /= 10;
        }
        int sum = 0;
        temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, n);
            temp /= 10;
        }
        return num == sum;
    }
}
