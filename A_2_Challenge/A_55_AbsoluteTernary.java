package A_2_Challenge;

import java.util.Scanner;

class A_55_AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}
