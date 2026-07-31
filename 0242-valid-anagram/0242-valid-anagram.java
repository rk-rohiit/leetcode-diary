class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna