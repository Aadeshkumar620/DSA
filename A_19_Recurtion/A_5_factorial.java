package A_19_Recurtion;

import java.util.Scanner;

public class A_5_factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num:-");
        int n = sc.nextInt();
        System.out.println("Factorial = "+fact(n));
    }
}
