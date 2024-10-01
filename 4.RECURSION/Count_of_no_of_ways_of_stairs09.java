import java.io.*;
import java.util.Scanner;
public class Count_of_no_of_ways_of_stairs09 {
    public static int CountWays(int n){
        int res = 0 ;
        if(n<=1){
            return n ;
        }
        else{
            res = CountWays(n-1) + CountWays(n-2);
        }
        return res ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of stairs: ");
        int n = sc.nextInt();

        int res = CountWays(n+1);
        System.out.println("The no total ways of climbing up stairs is :" + res);

        
    }
}
