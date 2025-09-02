class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        //  for (char ch : ransomNote.toCharArray()) {
        //     String c = String.valueOf(ch);
        //     if (magazine.contains(c)) {
        //         // remove the first occurrence of the character
        //         magazine = magazine.replaceFirst(c, "");
        //     } else {
        //         return false; // character not found
        //     }
        // }
        // return true;


        int[] freq=new int[26];
        // int[] freq1=new int[26];
        for(char c: ransomNote.toCharArray()){
            freq[c-'a']++;
        }
        // for(char c: magazine.toCharArray()){
        //     freq1[c-'a']++;
        // }
         for (char c : magazine.toCharArray()) {
            if (freq[c - 'a'] > 0) {
                freq[c - 'a']--; // one requirement satisfied
            }
        }

        // Check if all requirements are satisfied
        for (int count : freq) {
            if (count > 0) {
                return false;
            }
        }
        return true;



        // for(char c:magazine.toCharArray()){
        //     if(freq[c-'a'] == 0){
        //         return false;
        //     }
        //         freq[c-'a']--;
        // }
        // return true;
    }
}