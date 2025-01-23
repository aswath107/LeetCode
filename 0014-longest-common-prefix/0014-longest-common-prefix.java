// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//          if (strs == null || strs.length == 0) {
//             return ""; 
//         }

//         StringBuilder result= new StringBuilder();

//         Arrays.sort(strs);
//         char[] fir = strs[0].toCharArray();
//         char[] las = strs[strs.length-1].toCharArray();

//         for(int i=0;i<fir.length;i++){
//             if(fir[i]!= las[i]){
//                 break;
//                 result.append(fir[i]);
//             }
//         }
//         return result.toString();
//     }
// }

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Handle edge case for empty array
        }

        StringBuilder result = new StringBuilder();
        Arrays.sort(strs); // Sort the array
        char[] fir = strs[0].toCharArray(); // First string after sorting
        char[] las = strs[strs.length - 1].toCharArray(); // Last string after sorting

        for (int i = 0; i < fir.length && i < las.length; i++) {
            if (fir[i] != las[i]) {
                break; // Exit the loop when characters don't match
            }
            result.append(fir[i]); // Append matching characters to the result
        }

        return result.toString(); // Return the longest common prefix
    }
}
