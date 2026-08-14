class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high) return;

       int piv = partition(arr,low,high);
        
        quickSort(arr,low,piv-1);
        quickSort(arr,piv+1,high);
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot = arr[low];
        int count = 0;
        
        for(int i = low + 1;i<=high;i++){
            if(arr[i] <= pivot) count++;
        }
        
        int pivIdx =low + count;
        
        int temp = arr[low];
        arr[low] = arr[pivIdx];
        arr[pivIdx] = temp;
        
        int i = low, j = high;
        
        while(i < pivIdx && j > pivIdx){
            while(arr[i] <= pivot){
                 i++;
            }
            while(arr[j] > pivot) j--;
            
            if(i < pivIdx && j > pivIdx){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        return pivIdx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna