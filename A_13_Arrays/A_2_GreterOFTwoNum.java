package A_13_Arrays;

import java.util.Scanner;

public class A_2_GreterOFTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nume1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the nume2 :-");
        int num2 = sc.nextInt();

        System.out.print("Enter the nume3 :-");
        int num3 = sc.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println("Num1 is Greter");
        }else if(num2 > num3 && num2 > num1){
            System.out.print("Num2 is Greter");
        }else{
            System.out.println("Num3 is Greter ");
        }
    }
}
