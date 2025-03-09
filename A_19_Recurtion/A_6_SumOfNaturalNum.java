package A_19_Recurtion;

import java.util.Scanner;

public class A_6_SumOfNaturalNum {
    public static int CalcSum(int n){
        if(n==1){
            return 1;
        }
        int sum1 = CalcSum(n-1);
        int sum = n+sum1;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:-");
        int n = sc.nextInt();
       System.out.println("Sum Of Natural Num:- "+CalcSum(n));
        
    }
}
