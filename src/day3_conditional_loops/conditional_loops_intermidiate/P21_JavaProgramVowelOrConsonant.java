package day3_conditional_loops.conditional_loops_intermidiate;

import java.util.Scanner;

public class P21_JavaProgramVowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character to check ");
        char c= in.next().charAt(1);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("Enter the character is Vowel ");
        }else{
            System.out.println("Enter the character is Consonant");
        }
        in.close();
    }
}
