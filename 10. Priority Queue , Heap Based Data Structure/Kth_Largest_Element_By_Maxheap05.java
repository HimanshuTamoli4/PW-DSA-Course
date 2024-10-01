import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

// Approch 2 =  it is by using Max heap 
public class Kth_Largest_Element_By_Maxheap05 {
    public static int FindKthLargest(int [] nums ,int k){

           PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            maxheap.add(nums[i]);
        }

        for(int i=0; i<k-1; i++){
            maxheap.remove();
        }

        

        return maxheap.peek();

    }
    public static void main(String[] args) {

        

        int[] nums = {3,2,1,5,6,4};

        int res = FindKthLargest(nums , 2);

        System.out.println("The kth largest element in the array is " + res);

        
    }
    
}
