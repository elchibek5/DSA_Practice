class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];

        while (min != 0) {
            int t = max % min;
            max = min;
            min = t;
        }
        return max;
    }
}
