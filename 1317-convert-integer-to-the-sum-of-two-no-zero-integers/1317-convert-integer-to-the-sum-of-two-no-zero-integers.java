class Solution {
    public int[] getNoZeroIntegers(int n) {

        //this is hint  and learned in chatgpt
        //    for (int a = 1; a < n; a++) {
        // int b = n - a;

        // if (!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")) {
        //     return new int[] {a, b};

        int b = 0;
        for (int a = 1; a < n; a++) {
            b = n - a;
            if (isnonZero(a) && isnonZero(b)) {
                return new int[] { a, b };
            }
        }
        return new int[] {};
    }

    public static boolean isnonZero(int p) {

        while (p > 0) {
            if (p % 10 == 0) {
                return false;
            }
            p = p / 10;

        }
        return true;

    }
}
