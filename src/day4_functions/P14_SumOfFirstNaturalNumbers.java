package day4_functions;

import java.util.Scanner;

public class P14_SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to Calculate sum");
        int num = in.nextInt();
        System.out.println("Sum of First Natural Number Till Given Number : " + sum(num));
        System.out.println("Sum is : " + (num * (num + 1)) / 2);
        in.close();
    }

    static int sum(int num) {
        int ans = 0;
        for (int i = 0; i <= num; i++) {
            ans += i;
        }
        return ans;
    }
}
