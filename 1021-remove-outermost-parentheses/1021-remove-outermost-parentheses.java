class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;

    for (final char c : s.toCharArray())
      if (c == '(') {
        if (++opened > 1)
          sb.append(c);
      } else if (--opened > 0) {
        sb.append(c);
      }

    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna