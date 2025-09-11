class Solution {
    public String sortVowels(String s) {

        int n = s.length();
        List<Character> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isvowel(Character.toLowerCase(s.charAt(i)))) {
                a.add(s.charAt(i));
            }
        }
        Collections.sort(a);
        StringBuilder sb = new StringBuilder(s);

        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (isvowel(Character.toLowerCase(s.charAt(i)))) {
                sb.setCharAt(i, a.get(ind));
                ind++;
            }
        }
        return sb.toString();

    }

    public static boolean isvowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}