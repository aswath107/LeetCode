class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

      int tot=numBottles;
        int emp=numBottles;

        while(emp>=numExchange){
           int ndrink=emp/numExchange;
           tot+=ndrink;
           emp=ndrink+(emp%numExchange);

        }
        return tot;

        
    }
}