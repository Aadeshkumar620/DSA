package A_13_Arrays;

import java.util.Scanner;

public class A_4_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the element "+i+" :- ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the find num:- ");
        int find = sc.nextInt();
        
        boolean flag = false;
        for(int i=0; i<size; i++){
           if( arr[i] == find ){
            flag = true;
            break;
        }
    }
    if(flag == true){
        System.out.print("Find out");
    }else{
        System.out.print("Not find out");
    }
 }
}
