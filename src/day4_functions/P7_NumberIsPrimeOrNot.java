package day4_functions;

import java.util.Scanner;

public class P7_NumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to check Prime or Not");
        int num = in.nextInt();
        System.out.println(isPrime(num) ? "Given Number is Prime " : "Given Number is Not Prime");
        in.close();
    }

    static boolean isPrime(int n1) {
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}
