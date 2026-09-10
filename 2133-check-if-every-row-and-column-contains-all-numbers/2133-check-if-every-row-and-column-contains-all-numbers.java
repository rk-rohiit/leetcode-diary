class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        // for row
        for(int i = 0; i<n;i++){
            HashSet<Integer> row = new HashSet<>();
            for(int j = 0; j < n;j++){
                row.add(matrix[i][j]);
            }
            if(row.size() != n){
                return false;
            }
        }
        // for col
        for(int i = 0; i<n;i++){
            HashSet<Integer> col = new HashSet<>();
            for(int j = 0; j < n;j++){
                col.add(matrix[j][i]);
            }
            if(col.size() != n){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna