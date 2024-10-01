import java.util.Scanner;

public class quiz5b {
    public static int isArmstrongnum(int n){
        if(n<10){
            return n*n*n;
        }
        else{
            return (n%10)*(n%10)*(n%10) +isArmstrongnum(n/10);
        }
    }
    public static void main(String[] args) {
        int num ,  arm_num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
         num = sc.nextInt();
       arm_num = isArmstrongnum(num);
       if(arm_num == num){
        System.out.println("The num " + num + " is armstrong number ");
       }
else{
    System.out.println("The num "+ num + " is not a armstrong number ");
}
        
    }
}
