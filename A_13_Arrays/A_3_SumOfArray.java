package A_13_Arrays;

import java.util.Scanner;

public class A_3_SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i=0; i<size; i++){
            System.out.print("Enter the element "+i+" :- ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<size; i++){
            sum +=arr[i];
        }
        System.out.print("Sum of arrays ="+ sum);

    }
}
