// Time Complexity: O(n)
// Space Complexity: O(1)
// Kadane's Algorithm

class kadanes_algorithm06 {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = nums[0];

        for(int i=0; i<nums.length; i++){
            // current subarray sum
            sum += nums[i];
            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};  

        System.out.println("The maximus sum of subarray is : " + maxSubArray(nums) );
    }
}