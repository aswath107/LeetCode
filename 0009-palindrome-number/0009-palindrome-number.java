class Solution {
    public boolean isPalindrome(int x) {

        if(x==0){
            return true;
        }
        if(x<0||x%10==0){
            return false;
        }
        int r=0;
        while(x>r){
            int sum=x%10;
            x/=10;
            r=(r*10)+sum;
        }
        if(x==r || x==r/10){
            return true;
        }
        else{
        return false;}
    }
}