import java.util.*;
import java.io.*;


public class Lower_Bound3 {
    public static int findfirstOccurence(int arr[], int  target){
        int low =0 ;
        int high = arr.length-1;
        int result = -1 ;
        while(low<=high){
           int mid = low +(high-low)/2;
           if(arr[mid]==target){
                result = mid ;
                high = mid -1 ;
              
           }
           else if(arr[mid]<target){
               low = mid+1 ;
           }
           else{
               high = mid-1;
           }
          
       }
        return result;

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
    int target = sc.nextInt();
    int result = findfirstOccurence(arr,target);

    if( result == -1){
        System.out.println("Searched element is not found in array");
    
    }
    else{
        System.out.println("Searched element first occurence is found at index "+ result);
    }



    }
    
}

// time complexity = O(logN)
// Space complexity = O(1)