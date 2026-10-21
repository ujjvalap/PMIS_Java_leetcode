class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            ans += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }

        if (timeSeries.length > 0) {
            ans += duration;
        }

        return ans;
    }
}