class Solution {
    public int climbStairs(int n) {
        if(n < 2) return n;
        int step1 = 1;
        int step2 = 2;

        for(int i = 3; i<= n;i++){
            int temp = step1 + step2;
            step1 = step2;
            step2 = temp;
        }
        return step2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna