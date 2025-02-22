class Solution {
    public int maximumDifference(int[] nums) {
      
      int q=-1;
       ArrayList<Integer>a=new ArrayList<Integer>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    a.add(nums[j]-nums[i]);
                }
            }
        }

        if(!a.isEmpty()){
            q=Collections.max(a);
        }
return q;
    }
}