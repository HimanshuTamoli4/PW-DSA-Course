import java.util.Scanner;

public class Fibonacci_Number02 {
    
    public static int fib(int n){
        int res = 0 ;
        if(n<=1){
            return n ;
        }
        else{
            res = fib(n-1) + fib(n-2);
        }
        return res ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in fibonacci series ");
        int n = sc.nextInt();
        int res = fib(n);
        System.out.println("The final output is : "+ res);
    }
}
