package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P13_CalculateAverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int sub = in.nextInt();
        int[] temp = new int[sub];
        System.out.println("Enter Array Element ");
        for (int i = 0; i < sub; i++) {
            temp[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < sub; i++) {
            sum += temp[i];
        }
        System.out.println("Avg of Array is = " + sum / sub);
        in.close();
    }
}
