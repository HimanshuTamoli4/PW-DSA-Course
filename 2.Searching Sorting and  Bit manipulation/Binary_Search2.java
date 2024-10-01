import java.util.Scanner;
import java.util.*;
import java.io.*;

 class Binary_Search2 {
    public static int binarysearch(int arr[], int target){
        int low =0 ;
         int high = arr.length-1;
         while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                return mid ;
            }
            else if(arr[mid]<target){
                low = mid+1 ;
            }
            else{
                high = mid-1;
            }
           
        }
         return 0;
    }
       

   public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element present in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }       

        System.out.println("Enter the element which you want to search");
        int x = sc.nextInt();
     

       
        int result = binarysearch(arr,x);

        if( result == 0){
            System.out.println("Searched element is not found in array");
        
        }
        else{
            System.out.println("Searched element is found at index "+ result);
        }
    }
}
// time complexity = O(logN)
// Space complexity = O(1)

