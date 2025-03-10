package A_19_Recurtion;

import java.util.Scanner;

public class A_14_Remove_Duplicate {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println("Uniqe Result = "+newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.nextLine();
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
