class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int posi=0,sum=0,tot=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                tot+=sum;
                sum=0;
                posi=i+1;
            }
        }
        tot+=sum;
        return tot>=0?posi:-1;
    }
}