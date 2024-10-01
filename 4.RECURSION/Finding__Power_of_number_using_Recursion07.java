import java.io.*;
import java.util.*;

public class Finding__Power_of_number_using_Recursion07 {
    public static long Powerofnum(long a , long b){
        long mid = 0 , res = 0 , final_res = 0 ;
        if(b==1){
            return a ;
        }
        else{

            mid = b/2 ;
            res = Powerofnum(a,mid);
            final_res = res*res ;
            if(b%2==0){
                return final_res ;
            }
            else{
                return a * final_res ;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b ");
        int a = sc.nextInt();
        long b = sc.nextInt();

        long res = Powerofnum(a,b);
        System.out.println("The power of a^b is : " + res);

    }
}
