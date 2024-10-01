import java.util.*;
import java.io.*;

class Linear_Search1{
    public static void main(String[] args) {
        int idx = -1;
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
        for(int i =0 ; i<n ; i++){
            if(arr[i]==x){
                idx = i ;
                break ;

            }
        }


        if( idx == -1){
            System.out.println("Searched element is not found in array");
        
        }
        else{
            System.out.println("Searched element is found at index "+ idx);
        }

    }
}

// time complexity = O(n)
// Space complexity = O(1)