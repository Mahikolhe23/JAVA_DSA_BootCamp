package day4_functions;

import java.util.Scanner;

public class P10_NumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to Check Palindrome or Not");
        int num = in.nextInt();
        System.out.println(isPalindrome(num) ? "Given Number is Palindrome" : "Given Number is Not Palidrome");
        in.close();
    }

    static boolean isPalindrome(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        return sum == num;
    }
}
