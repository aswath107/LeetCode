class Solution {
    public int singleNumber(int[] nums) {
        
        // int [] freq=new int[30001];

        // for(int i=0;i<nums.length;i++){
        //     freq[nums[i]]++;
        // }
        // int m=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>m){
        //         m=nums[i];
        //     }
        // }

        // for(int i=0;i<=m;i++){
        //    if(freq[i]==1){
        //     return i;
        //     }
        // }
        // return -1;

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i: nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

      for(Map.Entry<Integer,Integer> i:hm.entrySet()){
        int k=i.getKey();
        int v=i.getValue();
        if(v==1){
            return k;
        }
      }
        return -1;
    }
    
}