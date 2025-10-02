class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int tot=numBottles;
        int cost=numExchange;
        int emp=numBottles;

        while(emp>= cost){
            emp=emp-cost+1;
            tot++;
            cost++;
        }
return tot;

        

    }
}