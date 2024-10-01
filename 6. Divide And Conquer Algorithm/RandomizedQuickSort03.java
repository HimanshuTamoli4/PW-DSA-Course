import java.io.*;
import java.util.*;


public class RandomizedQuickSort03 {

public static int Partition(int[] arr , int l , int h){
    // ==> generate the random inex within the array
// pivot element is not fixed but randomly choosen to minimize possibility of getting worst case scenario
    int Randomindex = l + (int)Math.random()%(h-l+1);  
    // swaping between arr[Randomindex] , arr[l]
    int tem = arr[Randomindex];
    arr[Randomindex] = arr[l];
    arr[l] = tem;

    int i = l ;

    int pivot = arr[l] ;

    for(int j = l+1 ; j<=h ; j++){
        if(arr[j]<=pivot){
            i = i+1 ;
            // swap  element between arr[i] , arr[ j ] 
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp; 
        
        }
    }

// swap between pivot(arr[l]) and arr[i]
// ==> to return the correct index of the pivot element 
int  temp = arr[l];
arr[l] = arr[i];
arr[i] = temp ;

return i ;  // ==> i = correct position of pivot element 
}

   
     // l = lower bound 
    // h = higher bound 
    public static void quickSort(int[] arr , int l , int h){
        if(l<h){
            // 1. dividing the array into a subproblem
            int m = Partition(arr,l,h);
            // 2. Conquer the subproblems via the recursion
            quickSort(arr, l, m-1);
            quickSort(arr, m+1, h);
        }
    }

    public static void Printarr(int[] arr , int n){
        for(int i = 0 ; i<n ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {50,20,70,90,10 , 13 ,17,21,};
        int n = arr.length;
        System.out.println("Araay before sorted is :");
        Printarr(arr,n);

        quickSort(arr,0,n-1);

        System.out.println("Araay After sorted is :");
        Printarr(arr,n);

    }
}
