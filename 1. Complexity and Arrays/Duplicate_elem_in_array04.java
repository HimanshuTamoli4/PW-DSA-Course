public class Duplicate_elem_in_array04 {
    public static void main(String[] args) {
        int arr[] = {2,4,4,7,7,14,75,75,12,16,16,8};
        int n = arr.length ;
         for(int i  = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i]==arr[j]){
                System.out.println("Duplicate element in array is :  " + arr[i]);
                }
            }
         }
    }
    
}
