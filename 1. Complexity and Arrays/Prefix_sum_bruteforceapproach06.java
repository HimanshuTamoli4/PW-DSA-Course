import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Prefix_sum_bruteforceapproach06 {
    public static int  findSumMatrix(int[][]  arr, int r1 , int c1 ,int r2 , int c2 ){
        int sum = 0 ;
        for(int i = r1 ; i<=r2 ; i++ ){
            for(int j = c1 ; j<=c2 ; j++){
                sum += arr[i][j];
            }
           
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of raws : ");
        int m = sc.nextInt();
        
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt() ;
        int arr[][] = new int[m][n] ;
        System.out.println("Enter the matrix elements ");
        for(int i=0 ; i<arr.length ; i ++){
            for(int j=0 ; j<arr[0].length ; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }

            int r1 ,r2 , c1 ,c2 ;
            System.out.println("Enter the value of r1 Co ordinate");
            r1 = sc.nextInt();
             System.out.println("Enter the value of c1 Co ordinate");
            c1 = sc.nextInt();

              System.out.println("Enter the value of r2 Co ordinate");
            r2 = sc.nextInt();
             
              System.out.println("Enter the value of c2 Co ordinate");
            c2 = sc.nextInt();
            int result  = findSumMatrix(arr , r1 , c1 , r2 ,c2);
            System.out.println("Sum of given elements in Array is : "  + result);

        
    }
}
// Time complexity =  O(m*n)
// Space complexity = O(1)