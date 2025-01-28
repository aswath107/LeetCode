class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        // Add ASCII values of all characters in `t`
        for (char c : t.toCharArray()) {
            sum += c;
        }

        // Subtract ASCII values of all characters in `s`
        for (char c : s.toCharArray()) {
            sum -= c;
        }

        // The remaining value in `sum` is the extra character in `t`
        return (char) sum;
    }
}
