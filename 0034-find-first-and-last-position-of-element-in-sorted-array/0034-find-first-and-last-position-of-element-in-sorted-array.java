class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBond(nums, target,true);
        int last = findBond(nums, target,false);

        return new int[]{first,last};
    }

    private int findBond(int[] nums,int target, boolean isFirst){
        int low = 0, high = nums.length - 1;
        int bound = -1;
        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                bound = mid;
                if(isFirst){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return bound;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna