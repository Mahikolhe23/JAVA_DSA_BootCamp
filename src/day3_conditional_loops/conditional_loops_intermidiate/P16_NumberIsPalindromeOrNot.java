package day3_conditional_loops.conditional_loops_intermidiate;
import java.util.Scanner;

public class P16_NumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to check Palindrome or Not");
        int num = in.nextInt();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        System.out.println(sum == num ? "Palindrome" : "Not Palindrome");
        in.close();
    }
}
