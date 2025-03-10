package A_19_Recurtion;

import java.util.Scanner;

public class A_11_X_power_of_n {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 = power(x , n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value :- ");
        int x = sc.nextInt();
        System.out.print("Enter the power value :- ");
        int n = sc.nextInt();
        System.out.println("Result :- "+power(x, n));
    }
}
