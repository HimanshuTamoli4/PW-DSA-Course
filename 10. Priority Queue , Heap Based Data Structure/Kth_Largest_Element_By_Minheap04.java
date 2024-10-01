import java.util.PriorityQueue;

// Approch 1 =  it is by using min heap 
public class Kth_Largest_Element_By_Minheap04 {
    public static int FindKthLargest(int [] nums ,int k){

        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int num: nums ){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.remove();
            }


        }

        return minheap.peek();

    }
    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};

        int res = FindKthLargest(nums , 2);

        System.out.println("The kth largest element in the array is " + res);

        
    }
    
}
