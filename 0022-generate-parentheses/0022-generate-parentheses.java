class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(0, 0, n, "", ans);
        return ans;
    }
    private void dfs(int l, int r, int n, String t, List<String> ans) {
        
        if (l > n || r > n || l < r) {
            return;
        }

        if (l == n && r == n) {
            ans.add(t);
            return;
        }
        dfs(l + 1, r, n, t + "(", ans);
        dfs(l, r + 1, n, t + ")", ans);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna