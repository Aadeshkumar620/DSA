package A_19_Recurtion;

import java.util.Scanner;

public class A_2_Table {
    public static void table(int n, int t){
        if(n==1){
            System.out.println(n*t);
            return;
        }
        System.out.println(n*t);
        table(n-1, t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num:-");
        int t = sc.nextInt();
        table(10, t);
    }
}
