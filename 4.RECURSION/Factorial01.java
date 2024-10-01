 import java.util.*;
import java.io.*;

public class Factorial01 {
    public static int fact(int n ){
        int res = 0 ;
        if(n==0 || n==1){ // ==> Base comdtion 
            return 1 ;
        }
        else{
            res = n*fact(n-1); // ==> Recursive call
        }
        return res ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();        
     
        int res = fact(n);
        System.out.println("Factorial of a given no is :" + res );

   }
    
}
