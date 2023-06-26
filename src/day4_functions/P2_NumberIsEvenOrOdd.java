package day4_functions;

import java.util.Scanner;

public class P2_NumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Given is Even");
        } else {
            System.out.println("Given is Odd");
        }
        in.close();
    }
}
