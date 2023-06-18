package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P19_HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number to find HCF");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("HCF for this Number is : " + hcf(num1, num2));
        System.out.println("HCF for this Number is : " + hcf1(num1, num2));
        in.close();
    }

    static int hcf(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return hcf(n2, n1 % n2);
    }

    static int hcf1(int n1, int n2) {
        if (n1 == 0)
            return n2;
        if (n2 == 0)
            return n1;
        if (n1 == n2)
            return n1;
        if (n1 > n2)
            return hcf1(n1 - n2, n2);
        return hcf1(n1, n2 - n1);
    }
}
