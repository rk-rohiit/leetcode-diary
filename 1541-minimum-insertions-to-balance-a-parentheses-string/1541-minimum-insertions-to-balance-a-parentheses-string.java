class Solution {
    public int minInsertions(String s) {
        int neededRight = 0;
        int missingLeft = 0;
        int missingRight = 0;

        for (final char c : s.toCharArray())
            if (c == '(') {
                if (neededRight % 2 == 1) {
                    ++missingRight;
                    --neededRight;
                }
                neededRight += 2;
            } else if (--neededRight < 0) {
                ++missingLeft;
                neededRight += 2;
            }

        return neededRight + missingLeft + missingRight;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna