package day4_functions;

import java.util.Scanner;

public class P5_ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Num 1");
        int n1 = in.nextInt();
        System.out.println("Enter the Num 2");
        int n2 = in.nextInt();
        System.out.println("Product of Given Number is " + product(n1, n2));
        in.close();
    }

    static int product(int n1,int n2){
        return n1*n2;
    }
}
