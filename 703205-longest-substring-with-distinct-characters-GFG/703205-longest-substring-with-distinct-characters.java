class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        int left = 0,max=0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
            max = Math.max(max,i - left + 1);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna