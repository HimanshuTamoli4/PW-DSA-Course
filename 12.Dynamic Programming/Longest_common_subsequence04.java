public class Longest_common_subsequence04 {

// Recursive Approach 
// Time complexity = O(2^m*n) 
// Space complexity = O(n) 
public static int lcs(String s1 , String s2 , int m , int n){
if(m==0 || n==0){
    return 0;
}

if(s1.charAt(m-1) == s2.charAt(n-1)){
     return 1 + lcs(s1, s2, m-1, n-1);
}

else{
    return Math.max( lcs(s1, s2, m-1, n) , lcs(s1, s2, m, n-1));
}
}

// Memoization  Approach 
// Time complexity = O(m*n) 
// Space complexity = O(m*n) 
public static int lcsMemo(String s1 , String s2 , int m , int n , int[][] dp){
    if(m==0 || n==0){
        return 0;
    }

    // Optimization - to avoid recomputation of the same function calls due tp overlappingṇ
    if(dp[m][n]!=-1){
        return dp[m][n] ;
    }
    
    if(s1.charAt(m-1) == s2.charAt(n-1)){
         return dp[m][n] = 1 + lcs(s1, s2, m-1, n-1);
    }
    
    else{
        return dp[m][n] = Math.max( lcs(s1, s2, m-1, n) , lcs(s1, s2, m, n-1));
    }
    }

// Tabulation  Approach 
// Time complexity = O(m*n) 
// Space complexity = O(m*n) 
public static int lcsTab(String s1 , String s2 , int m , int n ){

    int[][] dp = new int[m+1][n+1];
    for(int i=0; i<=m;i++){
        for(int j=0; j<=n; j++){
            if(i==0 || j==0){
                dp[i][j] = 0;
            }
            else if (s1.charAt(i-1) == s2.charAt(j-1)) {
              dp[i][j] = 1+ dp[i-1][j-1];  
            }
            else{
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
    }
    return dp[m][n];
       }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();

       

        System.out.println("The longest common of the above strings is : " + lcsTab(s1,s2,m,n ));

    }
    
}
