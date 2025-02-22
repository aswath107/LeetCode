class Solution {
    public int reductionOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                sum+=(n-(i+1));
            }
        }
        return sum;
    }
}