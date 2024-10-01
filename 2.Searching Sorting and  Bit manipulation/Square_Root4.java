import java.util.Scanner;

public class Square_Root4 {
    public static int findsquareroot(int num){
        int low =0, high = num , result=-1 ;
        while(low<=high){
            int mid = low +(high-low)/2;
            long val = mid*mid ;
            if(val == num){
                // perfect square
                return mid ;
            }
            else if(val<num){
                result = mid ;
                low = mid +1 ;
            }
            else{
                high = mid-1 ;
            }
               
            }
          return result ;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number which you want of square root ");
  
  int num = sc.nextInt();
  int result = findsquareroot(num);
  System.out.println("The square root of a guven number is :  " + result);
    
}
}