
import java.util.*;

public class Climbing_Staircase02 {
    public static Map<Integer , Long> memo = new HashMap<>(); 

    // Time complexity = O(n)
    // Space Complexity = O(n)
    public static Long ClimbstairMemo(int n){
        if(n==1 || n==2){
            return (long) n ;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        Long NumWays = ClimbstairMemo(n-1) + ClimbstairMemo(n-2);

        memo.put(n, NumWays);
        return NumWays;


    }

    // function calling - Tabulation Dynamic Programming (No Recursion)
    // time complexity - O(n)
    // space complexity - O(n)

    public static long ClimbTab(int n){
        // intialization of an array
        long cs[] = new long[n+1];
        cs[0] = 0;
        cs[1] = 1;

        for(int i=2; i<=n; i++){
            cs[i] = cs[i-1] + cs[i-2];
        }

        return cs[n];
    }


      // function calling - Most optimized approach
    // time complexity - O(n)
    // space complexity - O(1)
    
    public static long fibOpt(int n){
        long first = 1 , second = 2, third;
        for(int i=3; i<=n; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return second;
    }


    public static void main(String[] args) {
        int n =  50 ;

        System.out.println("The number of ways for n is " + ClimbTab( n ));
        
    }
    
}
