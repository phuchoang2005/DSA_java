class Solution {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        int root = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = -prices[root] + prices[i];
            if (profit < 0) {
                root = i;
            } else {
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void export(int maxProfit) {
        System.out.println(maxProfit);
    }
}

public class LeetCode121 {
    public static void main(String[] args) {
        Solution.export(Solution.maxProfit(new int[] { 2, 1, 2, 1, 0, 1, 2 }));
    }
}