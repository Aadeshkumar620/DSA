package A_19_Recurtion;

import java.util.Scanner;

public class A_15_friendsPairing {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1+pairWays;
        return totWays;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the person :- ");
        int n = sc.nextInt();
        System.out.println("TotalWays:- "+friendsPairing(n));
    }
}
