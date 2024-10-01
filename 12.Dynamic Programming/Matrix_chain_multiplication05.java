import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix_chain_multiplication05 {
    // 1. Recursive Approach
    // Time  Complexity = O(2^n^2)
    // Space  Complexity = O(n)

    public static int minMatrixMul(int[] arr , int i , int j ){
        if(i==j){
            return 0 ;

        }
        int minopr = Integer.MAX_VALUE;

        for(int k = i ; k<j ; k++){
            int operation = minMatrixMul(arr, i, k) + minMatrixMul(arr, k+1, j) + arr[i-1]*arr[k]*arr[j];
            minopr = Math.min(operation, minopr);
        }
        return minopr ;
    }

// 2. Memoization Approach 
 // Time  Complexity = O(2^n^2)
 // Space  Complexity = O(n)

 public static int minMatrixMulMemo(int[] arr , int i , int j ){
    int n = arr.length;
    int[][] dp = new int[n][n];
    
        for(int[] row : dp){
            Arrays.fill(row, -1);
        } 

return minMatrixMulMemoHelper(arr, i, j , dp);

}

public static int minMatrixMulMemoHelper(int[] arr , int i , int j , int[][] dp){
    if(i==j){
        return 0 ;

    }

    // Optimized logic which avoid overlapping 

    if(dp[i][j]!=-1){
        return dp[i][j] ;
    }


    int minopr = Integer.MAX_VALUE;

    for(int k = i ; k<j ; k++){
        int operation = minMatrixMul(arr, i, k) + minMatrixMul(arr, k+1, j) + arr[i-1]*arr[k]*arr[j];
        minopr = Math.min(operation, minopr);
    }
    dp[i][j] = minopr ;
    return minopr ;
}


   public static void main(String[] args) {
    int[] arr = {1,2,3,4,3};
    int n = arr.length;
    int i = 1 ;
    int j = n-1;
    System.out.println("The minimum operation required for above matrix multipication : " +minMatrixMulMemo(arr,i,j));

    } 
}
