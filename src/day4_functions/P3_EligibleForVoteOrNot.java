package day4_functions;

import java.util.Scanner;

public class P3_EligibleForVoteOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Age to Check Eligibility");
        int age = in.nextInt();
        System.out.println(isEligible(age) ? "Candidate is Eligible for Vote" : "Candidate is not eligible");
        in.close();
    }

    static boolean isEligible(int age) {
        return age >= 18;
    }
}
