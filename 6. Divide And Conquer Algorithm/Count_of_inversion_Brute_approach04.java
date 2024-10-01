public class Count_of_inversion_Brute_approach04 {

    public static int inversioncount(int[] arr , int n){
        int count = 0 ;

        for(int i = 0 ; i<n-1 ; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    count+=1 ;

                }
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3,4};
        int n = arr.length;
        
        int count = inversioncount(arr,n);

        System.out.println("The inversion count of array is " + count);
       
    }
}
