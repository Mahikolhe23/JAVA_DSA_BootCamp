package day3_conditional_loops.conditional_loops_intermidiate;
import java.util.Scanner;

public class P22_PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to Check For Perfect Or Not");
        int num = in.nextInt();
        System.out.println(isPerfect(num)?"Given Number is Perfect":"Given Number is Not Perfect");
        in.close();
    }

    static boolean isPerfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
            sum+=i;
        }
        return sum==num;
    }
}
