class Solution {
    public int countSubstrings(String s) {
        
		int n=s.length();
		int c=0;
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		      
		        if(ispali(s,i,j)){
		            c++;
		        }
		    }
		}
	return c;
	}
		public static boolean ispali(String s,int i,int j){
		   while(i<j){
		       if(s.charAt(i) != s.charAt(j)){
		           return false;
		       }
		       i++;
		       j--;
		   }
		    return true;
		}
	

    }
