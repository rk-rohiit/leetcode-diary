class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        Map<Character,Integer> map = new HashMap<>();

        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        int req = map.size();
        int form = 0;

        Map<Character,Integer> wind = new HashMap<>();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            wind.put(ch,wind.getOrDefault(ch,0)+1);

            if(map.containsKey(ch) && wind.get(ch).intValue() == map.get(ch).intValue()){
                form++;
            }
            while(form == req){
                if(i - left+1 < minLen){
                    minLen = i - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                wind.put(leftChar,wind.get(leftChar) - 1);

                if(map.containsKey(leftChar) && wind.get(leftChar) < map.get(leftChar)) form--;

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start + minLen);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna