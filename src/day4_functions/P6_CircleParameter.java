package day4_functions;

import java.util.Scanner;

public class P6_CircleParameter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        int rad = in.nextInt();
        System.out.println("Circumference of Cirlce is " + circumference(rad) + " And Area of Circle " + area(rad));
        in.close();
    }

    static double circumference(int rad) {
        return Math.round(2 * Math.PI * rad * 100) / 100.0;
    }

    static double area(int rad) {
        return Math.round(Math.PI * rad * rad * 100) / 100.0;
    }
}
