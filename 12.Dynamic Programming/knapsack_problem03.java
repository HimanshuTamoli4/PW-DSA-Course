public class knapsack_problem03 {

    // Recursive Approach 
      // time complexity - O(2^n)
    // space complexity - O(n)
    public static int Knapsack(int m , int[] profit , int[] weight , int n){
        if( m == 0 || n == 0 ){
            return 0;
        }

        if(weight[n-1]>m){
            return Knapsack(m, profit, weight, n-1); // exclude the object 
        }

        else{
            return Math.max(Knapsack(m, profit, weight, n-1) ,profit[n-1] + Knapsack(m - weight[n-1], profit, weight, n-1));
    }
    }


     // Memoization method  Approach 
    // time complexity - O(m*n)
    // space complexity - O(m*n)
    public static int KnapsackMemo(int m , int[] profit , int[] weight , int n , int[][] dp){
        if( m == 0 || n == 0 ){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m] ;
        }

        if(weight[n-1]>m){
            return dp[n][m] = Knapsack(m, profit, weight, n-1); // exclude the object 
        }

        else{
            return dp[n][m] = Math.max(Knapsack(m, profit, weight, n-1) ,profit[n-1] + Knapsack(m - weight[n-1], profit, weight, n-1));
    }
    }


    // Function defination of helper function of memoization method 
    public static int helper(int m , int[] profit , int[] weight , int n){
        int dp[][] =  new int[n+1][m+1];
        for(int i=0 ;i<n+1 ;i++){
            for(int j=0 ;j<m+1 ; j++){
                dp[i][j] = -1 ;

            }
        }

        return KnapsackMemo(m, profit, weight, n , dp) ;

    }


    // Tabuation Method 
    // time complexity - O(m*n)
    // space complexity - O(m*n)
    public static int KnapsackTab(int m , int[] profit , int[] weight , int n ){
        int dp[][] =  new int[n+1][m+1];

        for(int i=0; i<=n; i++){
            for(int w=0; w<=m ; w++){
                if(i==0 || w==0 ){
                    dp[i][w] = 0;
                }
                else if(weight[i-1]<=w){
                    dp[i][w] = Math.max(dp[i-1][w], profit[i-1]+dp[i-1][w-weight[i-1]]);
                }
            else{
                dp[i][w] = dp[i-1][w];
            }
            }   
        }
        return dp[n][m];
    }


    public static void main(String[] args){
        int[] profit = {1,2,5,6};
       int[] weight = {2,3,4,5};

        int m = 8 ;
        int n = profit.length;
    
        System.out.println("'Maximum Profit of a given knapsack is " + KnapsackTab(m,profit,weight,n));
    }
}
