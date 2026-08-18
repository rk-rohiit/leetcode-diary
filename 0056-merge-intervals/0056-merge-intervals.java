class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> merge = new ArrayList<>();
        for(int[] interval : intervals){
            if(merge.isEmpty() || merge.get(merge.size() - 1)[1] < interval[0]){
                merge.add(interval);
            }else{
                merge.get(merge.size() - 1)[1] = Math.max(merge.get(merge.size() - 1)[1], interval[1]);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna