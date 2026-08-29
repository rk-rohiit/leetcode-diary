class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int left = 0;

        for(int num : nums) total += num;

        for(int i = 0; i < nums.length; i++){
            if(left == total - left - nums[i]) return i;
            left += nums[i];
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna