package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P25_EvenDaysInAMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Month Number");
        int month = in.nextInt();
        System.out.println("Number of ODD Days : " + oddDay(month));
        in.close();
    }

    static int oddDay(int month) {
        int ans = 0;
        if ((month == 2) || month == 4 || month == 6 || month == 9 || month == 11) {
            ans = 15;
        } else {
            ans = 16;
        }
        return ans;
    }
}
