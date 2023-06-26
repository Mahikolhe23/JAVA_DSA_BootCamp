package day4_functions;

import java.util.Scanner;

public class P8_GradingOfMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Marks out of 100");
        int mark = in.nextInt();
        System.out.println("Grade for Given Mark is " + grade(mark));
        in.close();
    }

    static String grade(int mark) {
        if (mark > 91 && mark < 100)
            return "AA";
        else if (mark > 81 & mark < 90)
            return "AB";
        else if (mark > 71 && mark < 80)
            return "BB";
        else if (mark > 61 && mark < 70)
            return "BC";
        else if (mark > 51 && mark < 60)
            return "CD";
        else if (mark > 41 && mark < 50)
            return "DD";
        else
            return "Fail";
    }
}
