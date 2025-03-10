package A_19_Recurtion;

import java.util.Scanner;

public class A_12_X_power_Of_N {
    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);

        // power is odd
        if(n%2 !=0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value :- ");
        int x = sc.nextInt();
        System.out.print("Enter the power value :- ");
        int n = sc.nextInt();
       System.out.println("Result :- "+ optimizedPower(x, n));
    }
}
