public class Missing_num_in_array03 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
        int n = arr.length;
        
        int sum_natural_num = ((n+1)*(n+2))/2 ;
        int sum_arr = 0 ;
        for(int i = 0 ;i<n; i++ ){
            sum_arr += arr[i] ;
        }
        int missing_elem = 0 ;
        missing_elem = sum_natural_num - sum_arr ;

        System.out.println("Missing number in array is : " + missing_elem);
    }

 
}
