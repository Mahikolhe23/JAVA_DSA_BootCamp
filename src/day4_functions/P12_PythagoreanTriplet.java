package day4_functions;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class P12_PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Three Number to Check Pythagorean Triplet or Not");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        in.close();
    }

    static boolean isPythagoreanTriplet(int n1, int n2, int n3) {
        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));
        int mid = 0;
        if ((max == n2 && min == n3) || (min == n2 && max == n3))
            mid = n1;
        else if ((max == n1 && min == n3) || (max == n3 && min == n1))
            mid = n2;
        else
            mid = n3;
        return true;
    
    }
}