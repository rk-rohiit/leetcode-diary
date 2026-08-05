class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int a2 = nums2.length;

        int newArrLen = a1 + a2;

        int[] newArr = new int[newArrLen];

        for(int i = 0;i<a1;i++) newArr[i] = nums1[i];
        for(int j = 0;j<a2;j++) newArr[a1 + j] = nums2[j];

        Arrays.sort(newArr);

        int n = newArr.length;
        double median;

        if(n % 2 == 1){
            median = newArr[n/2];
        }else{
            median = (newArr[(n/2) - 1] + newArr[n/2])/2.0;
        }
        return median;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna