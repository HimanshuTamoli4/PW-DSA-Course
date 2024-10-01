public class Binary_Search_using_Recursion06 {
    public static int binarysearch(int[] arr ,int low , int high , int x ){
        int res= -1 ;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return mid ;
            }
            else if(arr[mid]<x){
                
                return binarysearch(arr, mid +1 , high, x);

            }
            else{
                return binarysearch(arr, low, mid-1, x);
            }
        }
        return res ;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,12,16,19,21,27,29,35};
        int low = 0 ;
         int high = arr.length-1;
        int x = 28 ;
        int res = binarysearch(arr , low , high , x);
        System.out.println("The array element is at index : " +res);
    }
}
