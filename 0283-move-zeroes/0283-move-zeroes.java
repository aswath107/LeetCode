class Solution {
    public void moveZeroes(int[] nums) {

        int p=0;

        for(int m :nums){

            if(m !=0){
                nums[p]=m;
                p++;
            }
        }
        while(p<nums.length){
            nums[p]=0;
            p++;

        }
        
return ;

    }
}