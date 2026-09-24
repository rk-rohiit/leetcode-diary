class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i< nums.length;i++){
            int x = nums[i];
            int digSum = 0;
            while(x>0){
                digSum += x%10;
                x /= 10;
            }
            if(digSum == i) return i;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna