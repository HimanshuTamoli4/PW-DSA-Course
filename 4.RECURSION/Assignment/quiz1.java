// Approach 

public class quiz1 {
    public static int SumDigits(int n){
        int res = 0 ;
        if(n==0){
            return 0 ;
        }
        else{
            res = n%10 + SumDigits(n/10);
        }
        return res ;
    }
    public static void main(String[] args) {
        int num = 12345 ;
        int res = SumDigits(num);
        System.out.println("The sum of a given digits  is : "+ res);
    }
}
