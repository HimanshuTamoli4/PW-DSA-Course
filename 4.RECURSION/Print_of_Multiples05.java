public class Print_of_Multiples05 {
    public static void printmult(int n , int k){
        if(k==1){
            System.out.println(n);
            return ;
        }

        printmult(n, k-1);
        System.out.println(n*k);

    }
public static void main(String[] args) {
    int n = 24 ;
    int k = 5 ;
    printmult(n,k);
    System.out.println();
}
}
