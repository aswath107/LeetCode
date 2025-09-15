class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        String[] str =text.split(" ");
        int c=0;
        for(int i=0;i<str.length;i++){
            boolean ct=true;
            for(int j=0;j<brokenLetters.length();j++){
                char b=brokenLetters.charAt(j);
            if(str[i].contains(String.valueOf(b))){
                ct=false;
                break;
                // c++;
            }
            }
            if(ct)c++;
        }
 

return c;
    }
}