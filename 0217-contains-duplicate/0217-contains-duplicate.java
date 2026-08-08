class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        int n = nums.length;
        if(n <=1) return false;
        for(int i = 0;i<n;i++){
            for(int j = i + 1; j < n;j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
        */
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;

            set.add(num);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna