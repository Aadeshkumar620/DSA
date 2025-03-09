package A_19_Recurtion;

public class A_10_lastOccurence {
    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {4,8,6,7,5,8,5,6};
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
