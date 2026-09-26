class Solution {
    public void helper(Stack<Integer> s,int iniSize,int count){
        if(count == iniSize / 2){
            s.pop();
            return;
        }
        int top = s.peek();
        s.pop();
        helper(s,iniSize,count+1);
        s.push(top);
    }
    public void deleteMid(Stack<Integer> s) {
        // code here
        if(s.isEmpty()) return;
        helper(s,s.size(),0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna