public class Solution {
    public int[] GetSneakyNumbers(int[] nums) {
        
        Dictionary<int,int>dup=new Dictionary<int,int>();
        List<int>res=new List<int>();

        foreach(int i in nums){
            if(dup.ContainsKey(i)){
                dup[i]++;
            }
            else{
                dup[i]=1;
            }

        }

        foreach(var i in dup){
            if(i.Value >1){
                res.Add(i.Key);
            }
        }

        return res.ToArray();
    }
}