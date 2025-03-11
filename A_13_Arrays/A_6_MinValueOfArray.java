package A_13_Arrays;

import java.util.Scanner;

public class A_6_MinValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the element "+i+" :- ");
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.print("MinValue = "+min);
    }
}
