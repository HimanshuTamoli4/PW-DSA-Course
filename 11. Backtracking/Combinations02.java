import java.util.ArrayList;
import java.util.List;

public  class Combinations02{
    public void backtrack(List<List<Integer>> result , List<List<Integer>> comb , int start , int n , int k){
        if(comb.size()==k){
            result.add(new ArrayList<>(comb));
            return ;
        }
        for(int i=  start ; i<=n ; i++){
         comb.add(i);
         backtrack(result, comb, i+1, n, k);
         comb.remove(comb.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>() , 1,n,k);
        return result;

    }

public static void main(String[] args) {
 

}
 }

