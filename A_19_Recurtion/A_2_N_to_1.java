package A_19_Recurtion;

import java.util.Scanner;

public class A_N_to_1 {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:- ");
        int n = sc.nextInt();
        printDec(n);
    }
}
