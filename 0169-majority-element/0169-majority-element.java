class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int candidate = nums[0];
        int n = nums.length;
        for(int i = 1;i<n;i++){
            if(nums[i] == candidate) count++;
            else{
                count--;
                if(count == 0){
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        return candidate;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna