package A_19_Recurtion;

import java.util.Scanner;

public class A_13_Tiling {
    public static int tilingProblem(int n){   //2 * n (floor size)
        // base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        // vertical choise
        int fnm1 = tilingProblem(n-1);

        //horizontal choise
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1+fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tiling brith :- ");
        int n = sc.nextInt();
        System.out.println(tilingProblem(n));
    }
}
