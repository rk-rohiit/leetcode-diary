class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] row = new StringBuilder[numRows];
        for(int i = 0; i<numRows;i++){
            row[i] = new StringBuilder();
        }
        int cRow = 0;
        boolean isDown = true;

        for(char ch : s.toCharArray()){
            row[cRow].append(ch);
            if(cRow == 0){
                isDown = true;
            }else if(cRow == numRows - 1){
                isDown = false;
            }
            cRow += isDown ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder rows : row){
            res.append(rows);
        }
        return res.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna