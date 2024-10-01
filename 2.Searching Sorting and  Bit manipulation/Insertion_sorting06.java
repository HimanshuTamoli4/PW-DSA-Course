import java.util.Arrays;

public class Insertion_sorting06 {
    public static void  insertionsort(int arr[]){
        for(int i=1 ; i<arr.length ;i++){
            int j = i ;
              while(j>0 && arr[j]<arr[j-1]){
                int temp =arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp ;
                j--;
              } 
        }
    } 
    public static void main(String[] args) {
        int arr[] = {20,56,25,67,79,12,15};
        insertionsort(arr);
         System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
// time complexity: O(n^2)
// space complexity: O(1)