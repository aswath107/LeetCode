class Solution {
    public int countLargestGroup(int n) {
        
        int c=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=0,temp=i;
            while(temp>0){
                sum+=temp%10;
                temp=temp/10;
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            System.out.print(hm);
        }
        int ms=0;
        for(int i:hm.values()){
            ms=Math.max(ms,i);
        }
        for(int i:hm.values()){
            if(i==ms) c++;
        }
return c;
    }
}