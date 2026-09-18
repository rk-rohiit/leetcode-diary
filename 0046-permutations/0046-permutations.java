class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums,new ArrayList<>(),new boolean[nums.length],res);
        return res;
    }

    private void solve(int[] nums,List<Integer> cur,boolean[] use,List<List<Integer>>res){
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(use[i]) continue;
            use[i] = true;

            cur.add(nums[i]);
            solve(nums,cur,use,res);
            use[i] = false;
            cur.remove(cur.size() - 1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna