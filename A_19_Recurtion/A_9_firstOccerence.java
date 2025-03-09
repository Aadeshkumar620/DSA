package A_19_Recurtion;

public class A_9_firstOccerence {
    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return-1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {4,5,8,6,5,7,2,6,6};
        System.out.println(firstOccurence(arr, 6, 0));
    }
}
