package A_19_Recurtion;

public class A_8_isSorted {
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,9,10};
        System.out.println(isSorted(arr, 0));
    }
}
