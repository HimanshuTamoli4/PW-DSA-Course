class Ratmaze03 {
    public static void solveMaze(ArrayList<String> ans, int r , int c , int[][] m , int n , String p , boolean[][] vis){
        if(r==n-1 && c==n-1 && m[r][c]!=0){
            ans.add(p);
            return ; 
        }
        if(r>=0 && r<n && c>=0 && c<n){
            if(vis[r][c]==true || m[r][c]==0){
                return;
            }
            vis[r][c]=true;
            solveMaze(ans,r+1,c,m,n,p+'D',vis);//down
            solveMaze(ans,r,c-1,m,n,p+'L',vis);//left
            solveMaze(ans,r,c+1,m,n,p+'R',vis);//right
            solveMaze(ans,r-1,c,m,n,p+'U',vis);//up
            vis[r][c]=false;
        }
    } 
    
     public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        boolean vis[][] = new boolean[n][n];
        solveMaze(ans,0,0,m,n,"",vis);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}