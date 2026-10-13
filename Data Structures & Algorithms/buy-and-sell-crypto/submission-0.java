  class Solution {
      public int maxProfit(int[] prices) {
          int min = prices[0];
          int max = prices[0];
          int res = 0;

          for (int i = 0; i < prices.length; i++) {
              if (min > prices[i]) {
                  res = Math.max(res, max - min);
                  min = prices[i];
                  max = prices[i];
              }
              if (prices[i] > max) {
                  max = prices[i];
              }
              if (prices[i] > max) {
                  max = prices[i];
              }
          }

          return Math.max(res, max - min);
      }
  }
