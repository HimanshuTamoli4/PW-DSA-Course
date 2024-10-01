

import java.util.Scanner;
import java.util.*;
import java.io.*;


public class OnedArray_Quiz1 {
    public static int  findSumMatrix(int[]  arr ){
        int sum = 0 ;
         int m = arr.length ;
        int i = 0 ;
        while(i< m ){
            sum = sum + arr[i];
            i+=2;
        }
       
           
        
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size  of array : ");
        int m = sc.nextInt();
        
       
        int arr[] = new int[m];
        System.out.println("Enter the matrix elements ");
        for(int i=0 ; i<m ; i ++){
            
                arr[i] = sc.nextInt();

        }

       // int [] arr = {3,20,4,6,9};

            int result  = findSumMatrix(arr );
            System.out.println("Sum of given elements in Array is : "  + result);

        
    }
}
// Time complexity =  O(n)
// Space complexity = O(1)