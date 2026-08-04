class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0,maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen,i - left + 1);
        }
        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna