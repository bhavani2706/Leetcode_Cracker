// Last updated: 09/07/2026, 10:02:19
class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts) return 1.0; // Alice always wins

        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double windowSum = 1.0; // sum of last maxPts probabilities
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = windowSum / maxPts;

            if (i < k) {
                windowSum += dp[i]; // still can draw
            } else {
                result += dp[i]; // reached >= k, game ends
            }

            if (i - maxPts >= 0) {
                windowSum -= dp[i - maxPts];
            }
        }

        return result;
    }
}
