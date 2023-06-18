package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P20_LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two Number to Find LCM");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println("LCM of Two Number is :" + lcm(n1, n2));
        in.close();
    }

    static int lcm(int n1, int n2) {
        return (n1 / hcf(n1, n2)) * n2;
    }

    static int hcf(int n1, int n2) {
        if (n1 == 0)
            return n2;
        return hcf(n2 % n1, n1);
    }
}
