class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int best = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int len = 1;
                int cur = n;
                while (set.contains(cur + 1)) {
                    len++;
                    cur++;
                }
                best = Math.max(best, len);
            }
        }
        return best;
    }
}
