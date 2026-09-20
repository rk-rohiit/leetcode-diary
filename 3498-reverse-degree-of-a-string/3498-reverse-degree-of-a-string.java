class Solution {
    public int reverseDegree(String s) {
        int a = 0;
        for(int i = 0; i < s.length(); i++){
            int rev = 26 - (s.charAt(i) - 'a');
            a += rev * (i + 1);
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna