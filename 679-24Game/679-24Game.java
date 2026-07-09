// Last updated: 09/07/2026, 10:02:32
class Solution {
    private static final double EPSILON = 1e-6;
    private static final int TARGET = 24;

    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for (int card : cards) {
            nums.add((double) card);
        }
        return backtrack(nums);
    }

    private boolean backtrack(List<Double> nums) {
        if (nums.size() == 1) {
            return Math.abs(nums.get(0) - TARGET) < EPSILON;
        }

        // Try all pairs
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i == j) continue;

                List<Double> next = new ArrayList<>();
                for (int k = 0; k < nums.size(); k++) {
                    if (k != i && k != j) next.add(nums.get(k));
                }

                for (double res : compute(nums.get(i), nums.get(j))) {
                    next.add(res);
                    if (backtrack(next)) return true;
                    next.remove(next.size() - 1); // backtrack
                }
            }
        }
        return false;
    }

    private List<Double> compute(double a, double b) {
        List<Double> results = new ArrayList<>();
        results.add(a + b);
        results.add(a - b);
        results.add(b - a);
        results.add(a * b);
        if (Math.abs(b) > EPSILON) results.add(a / b);
        if (Math.abs(a) > EPSILON) results.add(b / a);
        return results;
    }
}
