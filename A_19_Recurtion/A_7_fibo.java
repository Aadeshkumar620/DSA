package A_19_Recurtion;

import java.util.Scanner;

public class A_7_fibo {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fibo(n-1);
        int fib2 = fibo(n-2);
        int fib3 = fib1+fib2;
        return fib3; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:- ");
        int n = sc.nextInt();
        System.out.println("fibo = "+fibo(n));
    }
}
