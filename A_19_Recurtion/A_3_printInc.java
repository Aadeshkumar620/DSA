package A_19_Recurtion;

import java.util.Scanner;

public class A_3_printInc {
    public static void printIncr(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        printIncr(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:- ");
        int n = sc.nextInt();
        printIncr(n);
    }
}
