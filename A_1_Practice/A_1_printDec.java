package A_1_Practice;

import java.util.Scanner;

public class A_1_printDec {
    public static void printDec(int n){
        if(n==0){
            System.out.println(n);
            return ;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:-");
        int n = sc.nextInt();
        printDec(n);
    }
    
}
