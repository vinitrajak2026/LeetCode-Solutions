class Solution {
    public int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
    for (int[] customer : accounts) {
//For each int[] customer in accounts
//accounts ke andar jo jo array hai, ek-ek karke customer mein daalo
//int [] q?kyunki har baar ek complete array/row milega.
        int rowSum = 0;
        for (int bank : customer) 
        rowSum += bank;
        maxWealth = Math.max(maxWealth, rowSum);
    }
    return maxWealth;  
    }
}