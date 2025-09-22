class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int n = nums.length;
        if (n == 1) {
            return 1;
        }

        int[] freq = new int[101];
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }

        int max = 0;
       
        for (int i = 1; i <= 100; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        if (max == 1) {
            return n;
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (freq[i] == max) {
                sum += freq[i];
            }
        }

        return sum;

        
//         int n=nums.length;
//         if(n==1){
//             return 1;
//         }
//         int[] freq =new int[101];
//         for(int i=0;i<n;i++){
//             freq[nums[i]]++;
//         }
//         int max=0;
//         for(int i=0;i<n;i++){
//             if(freq[i]>max){
//                 max=freq[i];
//             }
//         }
//         if(max==1 ){
//             return n;
//         }
//         int sum=0;
//         for(int i=0;i<n;i++){
//             if(freq[i]==max){
//                 sum+=freq[i];
//             }
//         }
// return sum;
    }
}