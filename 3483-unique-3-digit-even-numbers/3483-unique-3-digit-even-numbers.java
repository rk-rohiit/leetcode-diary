class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;
        for(int num = 100;num<=998; num +=2){
            int [] freq = new int [10];
            for(int d : digits){
                freq[d]++;
            }
            int temp = num;
            int ones = temp % 10;
            temp /= 10;

            int tens = temp % 10;
            temp /= 10;

            int hundred = temp;

            freq[hundred]--;
            freq[tens]--;
            freq[ones]--;

            if(freq[hundred] >= 0 && freq[tens] >= 0 && freq[ones] >= 0){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna