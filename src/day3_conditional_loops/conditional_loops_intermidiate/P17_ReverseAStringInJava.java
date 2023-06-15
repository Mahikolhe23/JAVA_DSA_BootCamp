package day3_conditional_loops.conditional_loops_intermidiate;
import java.util.Scanner;

public class P17_ReverseAStringInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name to Reverse");
        String name = in.next();
        String temp = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            temp = temp + name.charAt(i);
        }
        System.out.println("Reverse String is : " + temp);
        in.close();
    }
}
