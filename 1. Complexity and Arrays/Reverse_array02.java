public class Reverse_array02 {
    public static void main(String[] args) {
        int [] arr = {2,4,8,10,12,14};
        int n = arr.length;
        for(int i = 0 ; i<n/2 ; i++){
            // swap elements b/w arr[i] and arr[n-i-1]
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        
         }
         System.out.println("Reversal of array is :" );
         for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
         }
         System.out.println();
    }
    
}
// Time complexity =  O(n)
// Space complexity = O(1)