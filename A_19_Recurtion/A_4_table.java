package A_19_Recurtion;

import java.util.Scanner;

public class A_4_table {
    public static void printTable(int n, int t){
        if(n==1){
            System.out.println((n*t)+" ");
            return;
        }
        printTable(n-1, t);
        System.out.println((n*t)+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num :-");
        int t = sc.nextInt();
        printTable(10,t);
    }
}
