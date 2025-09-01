class Solution {
    public int countHillValley(int[] nums) {
        
        List<Integer> l=new ArrayList();
        int n=nums.length;
    if(n>1){
        l.add(nums[0]);
    }
        for(int i=1;i<n;i++){
            if(nums[i-1] != nums[i]){
                l.add(nums[i]);
            
            }
        }
        // for(int i=0;i<n-1;i++){
        //     System.out.print(l.get(i));
        // }
        int c=0;
        for(int i=1;i<l.size()-1;i++){
            if(l.get(i) >l.get(i-1) && l.get(i) > l.get(i+1)){
            c++;}
            else if(l.get(i) < l.get(i-1) && l.get(i) < l.get(i+1)){
            c++;}
        }
      return c;
        
        
    }
}