class Solution {
    public boolean doesAliceWin(String s) {
        
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean isvowel(char c){
        return c=='a'|| c=='e' || c=='i' || c=='o' ||c=='u' ;
    }
}