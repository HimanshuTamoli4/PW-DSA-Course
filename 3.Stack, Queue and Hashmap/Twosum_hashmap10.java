// Time complexity = O(n)
// Space complexity = O(n)


import java.util.HashMap;
import java.util.Scanner;

public class Twosum_hashmap10 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i= 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

           System.out.println("Enter the target element in an array:");
           int target = sc.nextInt();
           
           // Creating a hashmap where key is arr[i] and value is i
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int i = 0 ; i<n ; i++){
                map.put(arr[i], i);
            }


            int res[] = new int[2] ;


            // if current element is equal to the target 
            for(int i = 0 ; i<n ; i++){
                if(arr[i]== target && map.containsKey(0)){

                    res[0] = i ;
                    res[1] = map.get(0);
                    break ;
                }

                else if(map.containsKey(target - arr[i])){
                    // checking the element is non repeatable 
                    if(map.get(target-arr[i])>i){
                        res[0] = i ;
                        res[1] = map.get(target-arr[i]);
                        break ;

                        

                    }

                }
                else{
                    res[0] = -1 ;
                    res[1] = -1;
                }

            }

            System.out.println("Two sum Values are : [ " + res[0] + "," + res[1] + " ]");



    }
    
}
