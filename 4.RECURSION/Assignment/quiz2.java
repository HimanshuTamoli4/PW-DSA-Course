import java.util.Scanner;

public class quiz2 {
    public static int Alternatesum(int n){
        int res = 0 ;
        if(n==0){
            return 0 ;
        }
         if(n%2==0){
           res = Alternatesum(n-1) - n;
             
        }
        else{
            res = Alternatesum(n-1) + n;
        }
        return res ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int res = Alternatesum(n);
        System.out.println("The alternate sum of a number is : " + res);

    }
}
