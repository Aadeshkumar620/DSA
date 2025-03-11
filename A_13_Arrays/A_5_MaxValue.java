package A_13_Arrays;

import java.util.Scanner;

public class A_5_MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the element "+i+" :- ");
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
           if(arr[i]>max){
            max = arr[i];
           }
        }
        System.out.println("MaxValue :- "+max);
 
    }
}
