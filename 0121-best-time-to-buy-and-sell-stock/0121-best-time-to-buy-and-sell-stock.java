class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int msf = prices[0];
        for (int i=1; i<prices.length; i++){
            msf = Math.min(msf,prices[i]);
            max = Math.max(max,prices[i]-msf);
        }
        return max;
    }
}