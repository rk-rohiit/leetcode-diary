class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<=0) return 0;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = height[0];
        for(int i = 1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }
        suffix[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            suffix[i]= Math.max(suffix[i+1],height[i]);
        }
        int totalWater = 0;
        for(int i = 0;i<n;i++){
            totalWater += Math.min(prefix[i],suffix[i])-height[i];
        }
        return totalWater;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna