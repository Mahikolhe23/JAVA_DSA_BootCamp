package day3.conditional_loops_intermidiate;

import java.util.Scanner;

public class P10_CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the grading scale");
        int gc = in.nextInt();
        System.out.println("Enter the Marks Obtain");
        int marks = in.nextInt();
        System.out.println("Total CGPA : " + marks / gc);
        in.close();
    }
}
